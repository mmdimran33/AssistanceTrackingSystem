package com.assistancetrack.bean;

public class AuthenticationBean {
 public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
  private int userId;
 private String userName;
 private String userPassword;
 private String userNewPassword;
 public String getUserNewPassword() {
	return userNewPassword;
}
public void setUserNewPassword(String userNewPassword) {
	this.userNewPassword = userNewPassword;
}
public String getUserFirstName() {
	return userFirstName;
}
public void setUserFirstName(String userFirstName) {
	this.userFirstName = userFirstName;
}
public String getUserLastName() {
	return userLastName;
}
public void setUserLastName(String userLastName) {
	this.userLastName = userLastName;
}
public String getUserFirstMobileNo() {
	return userFirstMobileNo;
}
public void setUserFirstMobileNo(String userFirstMobileNo) {
	this.userFirstMobileNo = userFirstMobileNo;
}
public String getUserAlternateMoNo() {
	return userAlternateMoNo;
}
public void setUserAlternateMoNo(String userAlternateMoNo) {
	this.userAlternateMoNo = userAlternateMoNo;
}
public String getUserEmailId() {
	return userEmailId;
}
public void setUserEmailId(String userEmailId) {
	this.userEmailId = userEmailId;
}
@Override
public String toString() {
	return "AuthenticationBean [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword
			+ ", userNewPassword=" + userNewPassword + ", userFirstName=" + userFirstName + ", userLastName="
			+ userLastName + ", userFirstMobileNo=" + userFirstMobileNo + ", userAlternateMoNo=" + userAlternateMoNo
			+ ", userEmailId=" + userEmailId + "]";
}
private String userFirstName;
 private String userLastName;
 private String userFirstMobileNo;
 private String userAlternateMoNo;
 private String userEmailId;
}
