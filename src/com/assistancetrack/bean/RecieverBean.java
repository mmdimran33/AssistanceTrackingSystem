package com.assistancetrack.bean;

public class RecieverBean {
private String nickName;
private float amount;
private String createdDate;
private Integer RrecieverId;
@Override
public String toString() {
	return "RecieverBean [nickName=" + nickName + ", amount=" + amount + ", createdDate=" + createdDate
			+ ", RrecieverId=" + RrecieverId + "]";
}
public Integer getRrecieverId() {
	return RrecieverId;
}
public void setRrecieverId(Integer rrecieverId) {
	RrecieverId = rrecieverId;
}
public String getNickName() {
	return nickName;
}
public void setNickName(String nickName) {
	this.nickName = nickName;
}
public float getAmount() {
	return amount;
}
public void setAmount(float amount) {
	this.amount = amount;
}
public String getCreatedDate() {
	return createdDate;
}
public void setCreatedDate(String createdDate) {
	this.createdDate = createdDate;
}
}
