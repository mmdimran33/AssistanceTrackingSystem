package com.assistancetrack.bean;

public class AddMemberBean {

private Integer memberId;	
private String nikeName;
public Integer getMemberId() {
	return memberId;
}
public void setMemberId(Integer memberId) {
	this.memberId = memberId;
}
public String getNikeName() {
	return nikeName;
}
public void setNikeName(String nikeName) {
	this.nikeName = nikeName;
}
public String getfName() {
	return fName;
}
public void setfName(String fName) {
	this.fName = fName;
}
public String getlName() {
	return lName;
}
public void setlName(String lName) {
	this.lName = lName;
}
public String getFirstContact() {
	return firstContact;
}
public void setFirstContact(String firstContact) {
	this.firstContact = firstContact;
}
public String getSecondContact() {
	return secondContact;
}
public void setSecondContact(String secondContact) {
	this.secondContact = secondContact;
}
public String getProfession() {
	return profession;
}
public void setProfession(String profession) {
	this.profession = profession;
}

public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
private String fName;
private String lName;
private String firstContact;
private String secondContact;
private String profession;
private String date;
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
private String address;
@Override
public String toString() {
	return "AddMemberBean [memberId=" + memberId + ", nikeName=" + nikeName + ", fName=" + fName + ", lName=" + lName
			+ ", firstContact=" + firstContact + ", secondContact=" + secondContact + ", profession=" + profession
			+ ", date=" + date + ", address=" + address + "]";
}


}