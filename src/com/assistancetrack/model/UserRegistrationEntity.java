package com.assistancetrack.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="user")
public class UserRegistrationEntity implements Serializable{
	private static final long serialVersionUID = -723583058586873479L;
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
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="UserId")
	 private int userId;
	@Column(name="UserName")
	 private String userName;
	@Column(name="UserPassword")
	 private String userPassword;
	@Column(name="FirstName")
	 private String userFirstName;
	@Column(name="LastName")
	 private String userLastName;
	@Column(name="FirstMobileNo")
	 private String userFirstMobileNo;
	@Column(name="AlternateMobileNo")
	 private String userAlternateMoNo;
	@Column(name="EmailId")
	 private String userEmailId;
}
