package com.assistancetrack.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assistancetrack.dao.AuthenticationDao;
import com.assistancetrack.service.AuthenticationService;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
	
	@Autowired
	private AuthenticationDao dao;

	public boolean userAuthentication(String userNmae, String uPass) {
		
		return this.dao.userAuthentication(userNmae, uPass);
	}
	
}
