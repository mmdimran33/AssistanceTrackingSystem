package com.assistancetrack.dao;

import java.util.List;

import com.assistancetrack.bean.NeedyBean;
import com.assistancetrack.model.NeedyEntity;

public interface NeedyDao {
	public Integer addNeedy(NeedyBean needyBean);
	public List<Object[]> displayNeedy(NeedyEntity needyObj);
	public NeedyEntity editNeedyDetails(int id);
	public NeedyEntity updateNeedy(NeedyBean needBean);
}
