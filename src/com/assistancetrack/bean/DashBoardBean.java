package com.assistancetrack.bean;

public class DashBoardBean {
private Double recievedAmount;
public Double getRecievedAmount() {
	return recievedAmount;
}
public void setRecievedAmount(Double recievedAmount) {
	this.recievedAmount = recievedAmount;
}
public Double getDeliveredAmount() {
	return deliveredAmount;
}
public void setDeliveredAmount(Double deliveredAmount) {
	this.deliveredAmount = deliveredAmount;
}
public Double getInHandAmount() {
	return inHandAmount;
}
public void setInHandAmount(Double inHandAmount) {
	this.inHandAmount = inHandAmount;
}
private Double deliveredAmount;
private Double inHandAmount;
}
