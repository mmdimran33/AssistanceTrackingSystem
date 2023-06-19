package com.assistancetrack.model;

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
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="needy")
public class NeedyEntity implements Serializable{
private static final long serialVersionUID = -723583058586873479L;

	public NeedyEntity(){	
	}
	public NeedyEntity(Date registeredDate,Date amountDispatchDate){
		this.registeredDate=registeredDate;
		this.amountDispatchDate=amountDispatchDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		public String getMobileFirst() {
		return mobileFirst;
	}
	public void setMobileFirst(String mobileFirst) {
		this.mobileFirst = mobileFirst;
	}
	public String getMobileSecond() {
		return mobileSecond;
	}
	public void setMobileSecond(String mobileSecond) {
		this.mobileSecond = mobileSecond;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public Date getRegisteredDate() {
		return registeredDate;
	}
	public void setRegisteredDate(Date registeredDate) {
		this.registeredDate = registeredDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getReasonProblem() {
		return reasonProblem;
	}
	public void setReasonProblem(String reasonProblem) {
		this.reasonProblem = reasonProblem;
	}
	public Double getAmountAlotted() {
		return amountAlotted;
	}
	public void setAmountAlotted(Double amountAlotted) {
		this.amountAlotted = amountAlotted;
	}
	public Date getAmountDispatchDate() {
		return amountDispatchDate;
	}
	public void setAmountDispatchDate(Date amountDispatchDate) {
		this.amountDispatchDate = amountDispatchDate;
	}
	public String getRefName() {
		return refName;
	}
	public void setRefName(String refName) {
		this.refName = refName;
	}
	public String getRefMobileFirst() {
		return refMobileFirst;
	}
	public void setRefMobileFirst(String refMobileFirst) {
		this.refMobileFirst = refMobileFirst;
	}
	public String getRelationWithNeedy() {
		return relationWithNeedy;
	}
	public void setRelationWithNeedy(String relationWithNeedy) {
		this.relationWithNeedy = relationWithNeedy;
	}
	public Integer getNeedyId() {
		return needyId;
	}
	public void setNeedyId(Integer needyId) {
		this.needyId = needyId;
	}
	public String getLName() {
		return LName;
	}
	public void setLName(String lName) {
		LName = lName;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="needy_ID")
	private Integer needyId;
	@Column(name="Name")
	private String name;
	@Column(name="L_Name")
	private String LName;
	@Column(name="Mobile_No_F")
	private String mobileFirst;
	@Column(name="Mobile_No_S")
	private String mobileSecond;
	@Column(name="Profession")
	private String profession;
	@Column(name="Registered_Date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date registeredDate;
	@Column(name="Address")
	private String address;
	@Column(name="Reason_Problem")
	private String reasonProblem;
	@Column(name="Amount_Alloted")
	private Double amountAlotted;
	@Column(name="Amount_Dispatch_Date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date amountDispatchDate;
	@Column(name="Ref_Name")
	private String refName;
	@Column(name="Ref_Mobile_No_F")
	private String refMobileFirst;
	@Column(name="Relation_With")
	private String relationWithNeedy;
	@Column(name="Reason_Details")
	private String needyReasonDetails;

	public String getNeedyReasonDetails() {
		return needyReasonDetails;
	}
	public void setNeedyReasonDetails(String needyReasonDetails) {
		this.needyReasonDetails = needyReasonDetails;
	}
}
