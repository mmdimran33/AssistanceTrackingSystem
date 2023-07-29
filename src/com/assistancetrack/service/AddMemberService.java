package com.assistancetrack.service;

import java.util.List;

import com.assistancetrack.bean.AddMemberBean;
import com.assistancetrack.model.AddMember;

public interface AddMemberService {
	
	public Integer addMemberDetails(AddMemberBean addMemberBean);

	public List<AddMember> displayMemberDetails(AddMember memberEntity);

	public AddMember editMemberDetails(int id);

	public Integer editsaveMemberDetails(AddMemberBean addMemberBean);

}
