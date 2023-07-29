package com.assistancetrack.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assistancetrack.bean.RecieverBean;
import com.assistancetrack.dao.RecieverDao;
import com.assistancetrack.model.Reciever;
import com.assistancetrack.service.RecieverService;

@Service
public class RecieverServiceImpl implements RecieverService {
	
	@Autowired
	private RecieverDao recieverDao;
	

	@Override
	public Integer addRecieverDetails(RecieverBean recieverBean) {
		 
		Integer status=0;
		if(!"".equals(recieverBean.getNickName()) && 0!=recieverBean.getAmount()
			 && !"".equals(recieverBean.getCreatedDate())){
			
		}
	
		return this.recieverDao.addRecieverDetails(recieverBean);
	}

	@Override
	public List<Object[]> displayReciever(Reciever displayReciever) {
		
		return this.recieverDao.displayReciever(displayReciever);
	}

	@Override
	public List<Object[]> displayRecieverList(String nickName) {
		
		return this.recieverDao.displayRecieverList(nickName);
	}

	@Override
	public Reciever receiverEdit(int rid) {
		
		return this.recieverDao.receiverEdit(rid);
	}

	@Override
	public List<String> getNickNameList() {
		
		return this.recieverDao.getNickNameList();
	}

	@Override
	public Integer editsaveRecDet(RecieverBean recieverBean) {
		
		return this.recieverDao.editsaveRecDet(recieverBean);
	}

}
