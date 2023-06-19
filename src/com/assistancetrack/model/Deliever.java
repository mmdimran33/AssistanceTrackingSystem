package com.assistancetrack.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Component
@Entity
@Table(name="deliever")
public class Deliever implements Serializable {
	private static final long serialVersionUID = -723583058586873479L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="deliever_Id")
	private int delieverId;
	@Column(name="deliverdate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date delieverDate;
	public  Deliever(){
	}
	public  Deliever(Date delieverDate){
		this.delieverDate=delieverDate;
	}
	@Column(name="deliever_amount")
	private double delieverAmount;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private Reciever reciever;
	public Reciever getReciever() {
		return reciever;
	}
	public void setReciever(Reciever reciever) {
		this.reciever = reciever;
	}
	public int getDelieverId() {
		return delieverId;
	}
	public void setDelieverId(int delieverId) {
		this.delieverId = delieverId;
	}
	public Date getDelieverDate() {
		return delieverDate;
	}
	public void setDelieverDate(Date delieverDate) {
		this.delieverDate = delieverDate;
	}
	public double getDelieverAmount() {
		return delieverAmount;
	}
	public void setDelieverAmount(double delieverAmount) {
		this.delieverAmount = delieverAmount;
	}
	@Column(name="needy_ID")
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
	@Column(name="deliever_Name")
	private String delieverName;
	@Column(name="no_Of_Time_Paids")
	private Integer delieverNoOfTimePaid;
}
