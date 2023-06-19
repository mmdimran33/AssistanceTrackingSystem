package com.assistancetrack.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.assistancetrack.bean.DeliverBean;
import com.assistancetrack.model.Deliever;
import com.assistancetrack.model.Reciever;
@Repository
public class DeliverDaoImpl implements DeliverDao{
	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	Deliever delieverModelEntity;
	int status=0;
	int noOfPaidCounter=0;
	Date currenttimeStamp = new Date();
	@Override
	public Integer deliverSavePay(DeliverBean deliverBean){
		Session session = sessionFactory.openSession();
		delieverModelEntity.setNeedyID(deliverBean.getNeedyID());
		delieverModelEntity.setDelieverName(deliverBean.getDelieverName());
		delieverModelEntity.setDelieverNoOfTimePaid(++noOfPaidCounter);
		delieverModelEntity.setDelieverAmount(deliverBean.getDelieverAmount());
		delieverModelEntity.setDelieverDate(currenttimeStamp);
		status=(Integer)session.save(delieverModelEntity);
		session.close();
		return status;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> yearlySettlementDisplay(Deliever delieverModelEntity){
		Reciever reciever;
		System.out.println("date--"+delieverModelEntity.getDelieverDate());
		Session session1 = sessionFactory.openSession();
		Query query = session1.createSQLQuery("SELECT A.*, B.reciverdamount FROM(select year(deliverdate) AS deliverdate,sum(deliever_amount) AS deliever_amount from Deliever group by year(deliverdate)) A LEFT Join (select year(recieverdate) AS recieverdate,sum(amount) AS reciverdamount from reciever group by year(recieverdate) ) B on A.deliverdate = B.recieverdate;");
		List<Object[]> finalQuery=query.list();
		for (Object[] objects : finalQuery) {
			System.out.println("Deliver amount---"+objects[1]);
			System.out.println("Deliver date---"+objects[0]);
		}
		return finalQuery;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<String>getNeedyIdList(){
		List<String> needyIdList =  new ArrayList<String>();
		Session session2 = sessionFactory.openSession();
		SQLQuery needyQuery = session2.createSQLQuery("select distinct Name from needy where needy_ID is not null");
		needyIdList = needyQuery.list();
		return needyIdList;
	}
}
