package com.assistancetrack.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.assistancetrack.bean.AuthenticationBean;
import com.assistancetrack.model.Authentication;
import com.assistancetrack.model.Reciever;
@Repository
public class AuthenticationDaoImpl {
	@Autowired
	private SessionFactory sessionFactory;
	//Authentication authenticUser =new Authentication();
	public boolean userAuthentication(String userName,String uPass){
		boolean isValidUser = false;
		Session session= sessionFactory.openSession();
		String sqlQuery = "from Authentication u where userName=? and userPassword=?";
		Query query = session.createQuery(sqlQuery);
		query.setParameter(0, userName);
		query.setParameter(1, uPass);
		List userList =query.list();
		if((userList!=null)&& (userList.size()>0)){
			isValidUser = true;
			System.out.println("!!!!!!!!!valid user!!!!!!!!!!!!!!");
		}
		else{
			System.out.println("!!!!!!!!!not valid user!!!!!!!!!!!!!!");
		}
		session.close();
		return isValidUser;
	}
}
