package com.assistancetrack.dao;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.assistancetrack.bean.RecieverBean;
import com.assistancetrack.model.Reciever;
@Repository
public class RecieverDaoImpl implements RecieverDao{
@Autowired
private SessionFactory sessionFactory;
@Autowired
Reciever recieverobj ;//=new Reciever();
int status =0;
	@Override
	public Integer addRecieverDetails(RecieverBean recieverBean){
		Date rcDate = new Date();
		recieverobj.setRnickName(recieverBean.getNickName());
		recieverobj.setRamount(recieverBean.getAmount());
		recieverobj.setRreceivedate(recieverBean.getCreatedDate());
		recieverobj.setRecievertimeStamp(rcDate);
		Session session = sessionFactory.openSession();
		status=(Integer)session.save(recieverobj);
		session.close();
		return status;
	}
        @Override
		@SuppressWarnings("unchecked")
		public  List<Object[]> displayReciever(Reciever displayReciever){
		Session session1= sessionFactory.openSession();
		//Query query = session1.createQuery("from Reciever");
		Query query = session1.createQuery("Select rnickName, sum(ramount)from Reciever group by rnickName");
		List <Object[]> recieverList = query.list();
		System.out.println("666666"+query);
		session1.close();
		return recieverList;
	} 

	@SuppressWarnings("unchecked")
	@Override    
    public List <String> getNickNameList(){
		Session session2= sessionFactory.openSession();
		SQLQuery sqlQuery= session2.createSQLQuery("select distinct nikeName from member");
		List <String>nickNameList= sqlQuery.list();
		
		return nickNameList;
    }
	@Override
	public Reciever receiverEdit(int rid) {
		// TODO Auto-generated method stub
		System.out.println("914684767"+rid);
		Session session = this.sessionFactory.openSession();		
		Reciever am = (Reciever) session.load(Reciever.class, new Integer(rid));
		System.out.println("Person loaded successfully, Person details="+am);
		return am;
	}
	@Override
	@SuppressWarnings("unchecked")
	public List<Object[]> displayRecieverList(String nickName) {
		// TODO Auto-generated method stub
		
		System.out.println("555555550");
		Session session3= sessionFactory.openSession();
		Query sqlQuery= session3.createQuery("select rnickName, ramount, rreceivedate , rrecieverId from Reciever where rnickName =:nickName");
		sqlQuery.setParameter("nickName", nickName);
		System.out.println("555555550"+sqlQuery);
		List <Object[]> recieverDetailsList = sqlQuery.list();
		
		System.out.println(recieverDetailsList);
		session3.close();
		return recieverDetailsList;
	}
	@Override
	public Integer editsaveRecDet(RecieverBean recieverBean) {
		Session session = this.sessionFactory.openSession();
		Date date = Calendar.getInstance().getTime(); 
		System.out.println("date()"+date);
		Query qry = session.createSQLQuery("update reciever set nickName='"+recieverBean.getNickName()+"'"
				+ ",amount='"+recieverBean.getAmount()+"' "
				+ ",receivedate='"+recieverBean.getCreatedDate()+"' "
				+" where receiverId="+recieverBean.getRrecieverId()+"");
		System.out.println("qry!!!!!!!"+qry);
		status = qry.executeUpdate();
		System.out.println("status@@@@@"+status);
		return status;
	}
}
