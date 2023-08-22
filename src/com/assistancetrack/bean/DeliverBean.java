package com.assistancetrack.bean;

//@Component
public class DeliverBean {
private Integer needyID;

public Integer getNeedyID() {
	return needyID;
}
public void setNeedyID(Integer needyID) {
	this.needyID = needyID;
}
public String getDelieverName() {
	return delieverName;
}
public void setDelieverName(String delieverName) {
	this.delieverName = delieverName;
}
public Integer getDelieverNoOfTimePaid() {
	return delieverNoOfTimePaid;
}
public void setDelieverNoOfTimePaid(Integer delieverNoOfTimePaid) {
	this.delieverNoOfTimePaid = delieverNoOfTimePaid;
}
public Double getDelieverAmount() {
	return delieverAmount;
}
public void setDelieverAmount(Double delieverAmount) {
	this.delieverAmount = delieverAmount;
}
private String delieverName;
private Integer delieverNoOfTimePaid;
private Double delieverAmount;
}
