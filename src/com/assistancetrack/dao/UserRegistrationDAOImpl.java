package com.assistancetrack.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.assistancetrack.bean.AuthenticationBean;
import com.assistancetrack.model.UserRegistrationEntity;

@Repository
public class UserRegistrationDAOImpl implements UserRegistrationDAO {
	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	UserRegistrationEntity userRegisEntity;
	int status=0;
	public Integer saveUserRegistration(AuthenticationBean authenticBean){
		Session session = sessionFactory.openSession();
		userRegisEntity.setUserName(authenticBean.getUserName());
		userRegisEntity.setUserPassword(authenticBean.getUserPassword());
		userRegisEntity.setUserFirstName(authenticBean.getUserFirstName());
		userRegisEntity.setUserLastName(authenticBean.getUserLastName());
		userRegisEntity.setUserFirstMobileNo(authenticBean.getUserFirstMobileNo());
		userRegisEntity.setUserAlternateMoNo(authenticBean.getUserAlternateMoNo());
		userRegisEntity.setUserEmailId(authenticBean.getUserEmailId());
		status=(Integer)session.save(userRegisEntity);
		System.out.println("saveFlag UserRegistrationImpl!!!!!!!!!!!!" + status);
		return status;
	}
}
