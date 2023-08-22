package com.assistancetrack.dao;

import java.util.List;

import com.assistancetrack.bean.AddMemberBean;
import com.assistancetrack.model.AddMember;

public interface AddMemberDao {
	public Integer addMemberDetails(AddMemberBean addMemberBean);

	public List<AddMember> displayMemberDetails(AddMember memberEntity);

	public AddMember editMemberDetails(int id);

//public void editsaveMemberDetails(AddMemberBean addMemberBean);
	public Integer editsaveMemberDetails(AddMemberBean addMemberBean);
}
