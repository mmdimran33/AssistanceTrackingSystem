package com.assistancetrack.dao;

import java.util.List;

import com.assistancetrack.bean.RecieverBean;
import com.assistancetrack.model.Reciever;

public interface RecieverDao {
	public Integer addRecieverDetails(RecieverBean recieverBean);

	public List<Object[]> displayReciever(Reciever displayReciever);

	public List<Object[]> displayRecieverList(String nickName);

	public Reciever receiverEdit(int rid);

	public List<String> getNickNameList();

	public Integer editsaveRecDet(RecieverBean recieverBean);
}
