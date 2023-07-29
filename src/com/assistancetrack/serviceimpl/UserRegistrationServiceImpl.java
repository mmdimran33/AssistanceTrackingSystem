package com.assistancetrack.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assistancetrack.bean.AuthenticationBean;
import com.assistancetrack.dao.UserRegistrationDAO;
import com.assistancetrack.service.UserRegistrationService;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {

	@Autowired
	private UserRegistrationDAO userRegistrationServiceImpl;
	
	
	@Override
	public Integer saveUserRegistration(AuthenticationBean authenticBean) {
		
		int registerStatus=0;
		
		if((!"".equals(authenticBean.getUserName()) && !"".equals(authenticBean.getUserPassword())
			 &&!"".equals(authenticBean.getUserFirstName()) && !"".equals(authenticBean.getUserLastName()) &&
			 !"".equals(authenticBean.getUserFirstMobileNo()) && !"".equals(authenticBean.getUserAlternateMoNo())
			 && !"".equals(authenticBean.getUserEmailId()))){
			System.out.println("user is vailid.........");
			
			 registerStatus=this.userRegistrationServiceImpl.saveUserRegistration(authenticBean);
			
		}else {
			System.out.println("user is not valid........");
		}
		return registerStatus;
		
	}

}
