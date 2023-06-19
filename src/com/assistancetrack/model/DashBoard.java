package com.assistancetrack.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dashboard")
public class DashBoard  implements Serializable{
private static final long serialVersionUID = -723583058586873479L;
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="dashborad_id")
private int dashId;
@Column(name="Recieve_amt")
private Double dashRecieve;
@Column(name="Deliver_amt")
private Double dashRdeliver;
@Column(name="inhand_amt")
private Double dashRinHand;
public Double getDashRecieve() {
	return dashRecieve;
}
public void setDashRecieve(Double dashRecieve) {
	this.dashRecieve = dashRecieve;
}
public Double getDashRdeliver() {
	return dashRdeliver;
}
public void setDashRdeliver(Double dashRdeliver) {
	this.dashRdeliver = dashRdeliver;
}
public Double getDashRinHand() {
	return dashRinHand;
}
public void setDashRinHand(Double dashRinHand) {
	this.dashRinHand = dashRinHand;
}
public int getDashId() {
	return dashId;
}
public void setDashId(int dashId) {
	this.dashId = dashId;
}
}
