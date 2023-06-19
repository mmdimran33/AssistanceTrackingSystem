package com.assistancetrack.dao;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.sql.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.assistancetrack.bean.AddMemberBean;
import com.assistancetrack.model.AddMember;
import com.assistancetrack.model.UserRegistrationEntity;

@Repository
public class AddMemberDaoImpl implements AddMemberDao{
	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	AddMember addMember ;//= new AddMember();
	Date memberCurrentTimeStamp = new Date();
	int status =0;
	
	
	private JdbcTemplate jdbcTemplateObject;
	
	public JdbcTemplate getJdbcTemplateObject() {
		return jdbcTemplateObject;
	}

	public void setJdbcTemplateObject(JdbcTemplate jdbcTemplateObject) {
		this.jdbcTemplateObject = jdbcTemplateObject;
	}

	public Integer addMemberDetails(AddMemberBean addMemberBean){
		addMember.setMemberNikeName(addMemberBean.getNikeName());
		addMember.setMemberFName(addMemberBean.getfName());
		addMember.setMemberLName(addMemberBean.getlName());
		addMember.setMemberFirstContact(addMemberBean.getFirstContact());
		addMember.setMemberSecondContact(addMemberBean.getSecondContact());
		addMember.setMemberProfession(addMemberBean.getProfession());
		addMember.setMemberDate(memberCurrentTimeStamp);
		addMember.setMemberAddress(addMemberBean.getAddress());
		Session session = sessionFactory.openSession();
		status = (Integer)session.save(addMember);
		System.out.println("saveFlag DaoImpl!!!!!!!!!!!!" + status);
		return status;
	}
	
	@SuppressWarnings("unchecked")
	public List<AddMember> displayMemberDetails(AddMember memberEntity){
		Session session1 = sessionFactory.openSession();
		Query query = session1.createQuery("from AddMember");
		List<AddMember> memberList = query.list();
		return memberList;
		}
	
	public AddMember editMemberDetails(int id){
		Session session = this.sessionFactory.openSession();		
		AddMember am = (AddMember) session.load(AddMember.class, new Integer(id));
		System.out.println("Person loaded successfully, Person details="+am);
		return am;
	}
	
	public Integer editsaveMemberDetails(AddMemberBean addMemberBean) {
		System.out.println("getNikeName()"+addMemberBean.getNikeName());
		System.out.println("getDate()"+addMemberBean.getDate());
		System.out.println("getMemberId()"+addMemberBean.getMemberId());
		Session session = this.sessionFactory.openSession();
		Date date = Calendar.getInstance().getTime(); 
		System.out.println("date()"+date);
		Query qry = session.createSQLQuery("update member set nikeName='"+addMemberBean.getNikeName()+"'"
				+ ",firstName='"+addMemberBean.getfName()+"' "
				+ ",LastName='"+addMemberBean.getlName()+"' "
				+ ",Contact1='"+addMemberBean.getFirstContact()+"' "
				+ ",Contact2='"+addMemberBean.getSecondContact()+"' "
				+ ",profession='"+addMemberBean.getProfession()+"' "
				+ ",date='"+new Timestamp(date.getTime())+"' "
				+ ",address='"+addMemberBean.getAddress()+"' "
				+" where memberId="+addMemberBean.getMemberId()+"");
		System.out.println("qry!!!!!!!"+qry);
		status = qry.executeUpdate();
		System.out.println("status@@@@@"+status);
		return status;
	}
}

