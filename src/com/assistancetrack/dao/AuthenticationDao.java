package com.assistancetrack.dao;

import java.util.List;

import com.assistancetrack.model.Authentication;

public interface AuthenticationDao {
public  boolean  userAuthentication(String userNmae,String uPass);
}
