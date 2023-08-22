package com.assistancetrack.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.assistancetrack.bean.AuthenticationBean;
import com.assistancetrack.model.UserRegistrationEntity;

@Repository
public class ForgotPassDaoImpl implements ForgotPassDao{
	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	UserRegistrationEntity userRegisEntity;
	Integer status=0;
	@Override
	public Integer forgotPassword(AuthenticationBean authenticationBeanObj) {
		System.out.println(authenticationBeanObj);
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query query =session.createQuery("from UserRegistrationEntity where userName=:userId");
		query.setString("userId", authenticationBeanObj.getUserName());
		userRegisEntity = ( UserRegistrationEntity)query.list().get(0);
		userRegisEntity.setUserPassword(authenticationBeanObj.getUserPassword());
		session.update(userRegisEntity);
		session.getTransaction().commit();
		return status;
	}

}
