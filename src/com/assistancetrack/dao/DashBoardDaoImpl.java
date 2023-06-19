package com.assistancetrack.dao;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.assistancetrack.bean.DashBoardBean;

@Repository
public class DashBoardDaoImpl implements DashBoardDao{
	@Autowired
	private SessionFactory sessionFactory;
	@SuppressWarnings("unchecked")
	public List<Object[]> displayDashBoard(){
		Session session=sessionFactory.openSession();
		SQLQuery query=session.createSQLQuery("SELECT amount ,deliever_amount FROM (select SUM(amount) amount FROM  reciever)A CROSS JOIN (select SUM(deliever_amount)deliever_amount FROM  deliever)B");
		List<Object[]> dashBoardList=query.list();
		/*for(DashBoardBean obj:dashBoardList){
			System.out.println("dashBoardList receive amounts:"+ obj.getRecievedAmount());
		}*/
		return dashBoardList;
	}
}
