package com.assistancetrack.bean;

import java.util.Date;

public class NeedyBean {
private Integer needyID;
private String needyName;
private String needyLastName;
private String needyMobileNoFirst;
private String needyMobileNoSecond;
private String needyProfession;
private Date needyRegisteredDate;
private String needyAddress;
private String needyReasonProblem;
private Double needyAmountAlotted;
private Date needyAmountDispatchDate;
private String needyRefName;
private String needyRefMobileNoFirst;
private String needyRelationWithNeedy;
private String needyReasonDetails;
public String getNeedyReasonDetails() {
	return needyReasonDetails;
}
public void setNeedyReasonDetails(String needyReasonDetails) {
	this.needyReasonDetails = needyReasonDetails;
}
public Integer getNeedyID() {
	return needyID;
}
public void setNeedyID(Integer needyID) {
	this.needyID = needyID;
}
public String getNeedyName() {
	return needyName;
}
public void setNeedyName(String needyName) {
	this.needyName = needyName;
}
public String getNeedyLastName() {
	return needyLastName;
}
public void setNeedyLastName(String needyLastName) {
	this.needyLastName = needyLastName;
}
public String getNeedyMobileNoFirst() {
	return needyMobileNoFirst;
}
public void setNeedyMobileNoFirst(String needyMobileNoFirst) {
	this.needyMobileNoFirst = needyMobileNoFirst;
}
public String getNeedyMobileNoSecond() {
	return needyMobileNoSecond;
}
public void setNeedyMobileNoSecond(String needyMobileNoSecond) {
	this.needyMobileNoSecond = needyMobileNoSecond;
}
public String getNeedyProfession() {
	return needyProfession;
}
public void setNeedyProfession(String needyProfession) {
	this.needyProfession = needyProfession;
}
public Date getNeedyRegisteredDate() {
	return needyRegisteredDate;
}
public void setNeedyRegisteredDate(Date needyRegisteredDate) {
	this.needyRegisteredDate = needyRegisteredDate;
}
public String getNeedyAddress() {
	return needyAddress;
}
public void setNeedyAddress(String needyAddress) {
	this.needyAddress = needyAddress;
}
public String getNeedyReasonProblem() {
	return needyReasonProblem;
}
public void setNeedyReasonProblem(String needyReasonProblem) {
	this.needyReasonProblem = needyReasonProblem;
}
public Double getNeedyAmountAlotted() {
	return needyAmountAlotted;
}
public void setNeedyAmountAlotted(Double needyAmountAlotted) {
	this.needyAmountAlotted = needyAmountAlotted;
}
public Date getNeedyAmountDispatchDate() {
	return needyAmountDispatchDate;
}
public void setNeedyAmountDispatchDate(Date needyAmountDispatchDate) {
	this.needyAmountDispatchDate = needyAmountDispatchDate;
}
public String getNeedyRefName() {
	return needyRefName;
}
public void setNeedyRefName(String needyRefName) {
	this.needyRefName = needyRefName;
}
public String getNeedyRefMobileNoFirst() {
	return needyRefMobileNoFirst;
}
public void setNeedyRefMobileNoFirst(String needyRefMobileNoFirst) {
	this.needyRefMobileNoFirst = needyRefMobileNoFirst;
}
public String getNeedyRelationWithNeedy() {
	return needyRelationWithNeedy;
}
public void setNeedyRelationWithNeedy(String needyRelationWithNeedy) {
	this.needyRelationWithNeedy = needyRelationWithNeedy;
}
@Override
public String toString() {
	return "NeedyBean [needyID=" + needyID + ", needyName=" + needyName + ", needyLastName=" + needyLastName
			+ ", needyMobileNoFirst=" + needyMobileNoFirst + ", needyMobileNoSecond=" + needyMobileNoSecond
			+ ", needyProfession=" + needyProfession + ", needyRegisteredDate=" + needyRegisteredDate
			+ ", needyAddress=" + needyAddress + ", needyReasonProblem=" + needyReasonProblem + ", needyAmountAlotted="
			+ needyAmountAlotted + ", needyAmountDispatchDate=" + needyAmountDispatchDate + ", needyRefName="
			+ needyRefName + ", needyRefMobileNoFirst=" + needyRefMobileNoFirst + ", needyRelationWithNeedy="
			+ needyRelationWithNeedy + ", needyReasonDetails=" + needyReasonDetails + "]";
}
}
