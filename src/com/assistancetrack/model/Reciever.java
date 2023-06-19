package com.assistancetrack.model;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name="reciever")
public class Reciever  implements Serializable {
	private static final long serialVersionUID = -723583058586873479L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="receiverId")
	private Integer rrecieverId;
	@Column(name="nickName")
    private String rnickName ;
	@Column(name="amount")
	private float ramount;
	@Column(name="recieverdate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date recievertimeStamp;
	@Column(name="receivedate")
	private String rreceivedate;
	
	
	public String getRreceivedate() {
		return rreceivedate;
	}
	public void setRreceivedate(String rreceivedate) {
		this.rreceivedate = rreceivedate;
	}
	public Reciever(){
	}
    public Reciever(Date recievertimeStamp){
		this.recievertimeStamp=recievertimeStamp;
	}
	public Date getRecievertimeStamp() {
		return recievertimeStamp;
	}
	public void setRecievertimeStamp(Date recievertimeStamp) {
		this.recievertimeStamp = recievertimeStamp;
	}
	@OneToOne (cascade=CascadeType.ALL)
	private Deliever delieverInst;
	public Deliever getDelieverInst() {
		return delieverInst;
	}
	public void setDelieverInst(Deliever delieverInst) {
		this.delieverInst = delieverInst;
	}
	@OneToOne (cascade=CascadeType.ALL)
    @JoinColumn(name="receiverId" , referencedColumnName="memberId")
	private AddMember addMember;
	public AddMember getAddMember() {
		return addMember;
	}
	public void setAddMember(AddMember addMember) {
		this.addMember = addMember;
	}
	public Integer getRrecieverId() {
		return rrecieverId;
	}
	public void setRrecieverId(Integer rrecieverId) {
		this.rrecieverId = rrecieverId;
	}
	public String getRnickName() {
		return rnickName;
	}
	public void setRnickName(String rnickName) {
		this.rnickName = rnickName;
	}
	public float getRamount() {
		return ramount;
	}
	
	public void setRamount(float ramount) {
		this.ramount = ramount;
	}	
}
