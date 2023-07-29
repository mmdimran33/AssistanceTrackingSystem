package com.assistancetrack.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assistancetrack.bean.AddMemberBean;
import com.assistancetrack.dao.AddMemberDao;
import com.assistancetrack.model.AddMember;
import com.assistancetrack.service.AddMemberService;

@Service
public class AddMemberServiceImpl implements AddMemberService {
	
	@Autowired
	private AddMemberDao addMemberDao;

	@Override
	public Integer addMemberDetails(AddMemberBean addMemberBean) {
		int status=0;
		
		if(!"".equals(addMemberBean.getNikeName()) && !"".equals(addMemberBean.getfName())
			&& !"".equals(addMemberBean.getlName()) && !"".equals(addMemberBean.getFirstContact())
			&& !"".equals(addMemberBean.getSecondContact()) && !"".equals(addMemberBean.getAddress())
			&& !"".equals(addMemberBean.getProfession())) {
			
			status=this.addMemberDao.addMemberDetails(addMemberBean);	
		} 
		return status;  
	}   

	@Override
	public List<AddMember> displayMemberDetails(AddMember memberEntity) {
		
		return this.addMemberDao.displayMemberDetails(memberEntity);
	}

	@Override
	public AddMember editMemberDetails(int id) {
		
		return this.addMemberDao.editMemberDetails(id);
	}

	@Override
	public Integer editsaveMemberDetails(AddMemberBean addMemberBean) {
		
		int status=0;
		if(!"".equals(addMemberBean.getNikeName()) && !"".equals(addMemberBean.getfName())
				&& !"".equals(addMemberBean.getlName()) && !"".equals(addMemberBean.getFirstContact())
				&& !"".equals(addMemberBean.getSecondContact()) && !"".equals(addMemberBean.getAddress())
				&& !"".equals(addMemberBean.getProfession())) {
			
			status=this.addMemberDao.editsaveMemberDetails(addMemberBean);
		}
		

		return status;
	}

}
