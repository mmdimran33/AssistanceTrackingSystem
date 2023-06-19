package com.assistancetrack.dao;

import com.assistancetrack.bean.AuthenticationBean;

public interface UserRegistrationDAO {
  public Integer saveUserRegistration(AuthenticationBean authenticBean);
}
