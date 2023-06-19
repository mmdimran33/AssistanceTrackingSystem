package com.assistancetrack.model;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="member")
public class AddMember implements Serializable{
private static final long serialVersionUID = -723583058586873479L;
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="memberId")
private Integer memberId;	

@Column(name="nikeName")
private String memberNikeName;
@Column(name="firstName")
private String memberFName;
@Column(name="LastName")
private String memberLName;
@Column(name="Contact1")
private String memberFirstContact;
@Column(name="Contact2")
private String memberSecondContact;
@Column(name="profession")
private String memberProfession;
@Column(name="date")
@Temporal(TemporalType.TIMESTAMP)
private Date memberDate;
@Column(name="address")
private String memberAddress;
@OneToOne (mappedBy="addMember")
private Reciever reciever;


public Reciever getReciever() {
	return reciever;
}
public Date getMemberDate() {
	return memberDate;
}
public void setMemberDate(Date memberDate) {
	this.memberDate = memberDate;
}
public void setReciever(Reciever reciever) {
	this.reciever = reciever;
}
public Integer getMemberId() {
	return memberId;
}
public void setMemberId(Integer memberId) {
	this.memberId = memberId;
}
public String getMemberNikeName() {
	return memberNikeName;
}
public void setMemberNikeName(String memberNikeName) {
	this.memberNikeName = memberNikeName;
}
public String getMemberFName() {
	return memberFName;
}
public void setMemberFName(String memberFName) {
	this.memberFName = memberFName;
}
public String getMemberLName() {
	return memberLName;
}
public void setMemberLName(String memberLName) {
	this.memberLName = memberLName;
}
public String getMemberFirstContact() {
	return memberFirstContact;
}
public void setMemberFirstContact(String memberFirstContact) {
	this.memberFirstContact = memberFirstContact;
}
public String getMemberSecondContact() {
	return memberSecondContact;
}
public void setMemberSecondContact(String memberSecondContact) {
	this.memberSecondContact = memberSecondContact;
}
public String getMemberProfession() {
	return memberProfession;
}
public void setMemberProfession(String memberProfession) {
	this.memberProfession = memberProfession;
}

public String getMemberAddress() {
	return memberAddress;
}
public void setMemberAddress(String memberAddress) {
	this.memberAddress = memberAddress;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}
public AddMember(){
	
}
public AddMember(Date memberDate){
	this.memberDate=memberDate;
}
}
