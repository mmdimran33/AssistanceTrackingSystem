package com.assistancetrack.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assistancetrack.bean.AuthenticationBean;
import com.assistancetrack.dao.ForgotPassDao;
import com.assistancetrack.service.ForgotPassService;

@Service
public class ForgotPassServiceImpl implements ForgotPassService{

	@Autowired
	private ForgotPassDao dao;
	
	@Override
	public Integer forgotPassword(AuthenticationBean obj) {
		
		return dao.forgotPassword(obj);
	}

}
