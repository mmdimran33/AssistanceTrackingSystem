package com.assistancetrack.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.assistancetrack.bean.NeedyBean;
import com.assistancetrack.model.AddMember;
import com.assistancetrack.model.NeedyEntity;
@Repository
public class NeedyDaoImpl implements NeedyDao{
	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	NeedyEntity needyModelObj ;
	Date currentTimeStamp = new Date();
	int status =0;
	@Override
	public Integer addNeedy(NeedyBean needyBean){
	Session session= sessionFactory.openSession();
	needyModelObj.setName(needyBean.getNeedyName());
	needyModelObj.setLName(needyBean.getNeedyLastName());
	needyModelObj.setMobileFirst(needyBean.getNeedyMobileNoFirst());
	needyModelObj.setMobileSecond(needyBean.getNeedyMobileNoSecond());
	needyModelObj.setProfession(needyBean.getNeedyProfession());
	needyModelObj.setRegisteredDate(currentTimeStamp);
	needyModelObj.setAddress(needyBean.getNeedyAddress());
	needyModelObj.setReasonProblem(needyBean.getNeedyReasonProblem());
	needyModelObj.setNeedyReasonDetails(needyBean.getNeedyReasonDetails());
	needyModelObj.setAmountAlotted(needyBean.getNeedyAmountAlotted());
	needyModelObj.setAmountDispatchDate(currentTimeStamp);
	needyModelObj.setRefName(needyBean.getNeedyRefName());
	needyModelObj.setRefMobileFirst(needyBean.getNeedyRefMobileNoFirst());
	needyModelObj.setRelationWithNeedy(needyBean.getNeedyRelationWithNeedy());
	status=(Integer)session.save(needyModelObj);
	session.close();
	return status;
	}
	@Override
	@SuppressWarnings("unchecked")
	public List<Object[]> displayNeedy(NeedyEntity needyObj){
		Session session1= sessionFactory.openSession();
		
		//Query sqlQuery=session1.createQuery("from NeedyEntity");
		SQLQuery sqlQuery=session1.createSQLQuery("select nd.Name,nd.Mobile_No_F,nd.Ref_Name,nd.Amount_Alloted,nd.Amount_Dispatch_Date,dl.no_Of_Time_Paids,nd.needy_ID from  needy nd left join deliever dl on nd.needy_ID=dl.needy_ID");
		List<Object[]> needylist= sqlQuery.list();
		session1.close();
		return needylist;
	}
	@Override
	public NeedyEntity editNeedyDetails(int id) {
		Session session = this.sessionFactory.openSession();		
		NeedyEntity ne = (NeedyEntity) session.load(NeedyEntity.class, new Integer(id));
		System.out.println("Needy bean loaded successfully, Needy details="+ne);
		return ne;
	}

	public NeedyEntity updateNeedy(NeedyBean needyBean) {
		
		System.out.println("needBean.getNeedyName()"+needyBean.getNeedyName());
		System.out.println("needBean.getNeedyID()"+needyBean.getNeedyID());
		System.out.println("needBean.getNeedyMobileNoFirst()"+needyBean.getNeedyMobileNoFirst());
		Session session = this.sessionFactory.openSession();
		needyModelObj = (NeedyEntity) session.get(NeedyEntity.class, needyBean.getNeedyID());
		
		needyModelObj.setName(needyBean.getNeedyName());
		needyModelObj.setLName(needyBean.getNeedyLastName());
		needyModelObj.setMobileFirst(needyBean.getNeedyMobileNoFirst());
		needyModelObj.setMobileSecond(needyBean.getNeedyMobileNoSecond());
		needyModelObj.setProfession(needyBean.getNeedyProfession());
		needyModelObj.setRegisteredDate(currentTimeStamp);
		needyModelObj.setAddress(needyBean.getNeedyAddress());
		needyModelObj.setReasonProblem(needyBean.getNeedyReasonProblem());
		needyModelObj.setAmountAlotted(needyBean.getNeedyAmountAlotted());
		needyModelObj.setAmountDispatchDate(currentTimeStamp);
		needyModelObj.setRefName(needyBean.getNeedyRefName());
		needyModelObj.setRefMobileFirst(needyBean.getNeedyRefMobileNoFirst());
		needyModelObj.setRelationWithNeedy(needyBean.getNeedyRelationWithNeedy());
		
		Transaction tx = session.beginTransaction();
		session.update(needyModelObj);
		tx.commit();
		return 	needyModelObj;
			
	}
}
