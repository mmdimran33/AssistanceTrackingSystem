package com.assistancetrack.service;

import java.util.List;

import com.assistancetrack.bean.NeedyBean;
import com.assistancetrack.model.NeedyEntity;

public interface NeedyService {
	
	public Integer addNeedy(NeedyBean needyBean);
	public List<Object[]> displayNeedy(NeedyEntity needyObj);
	public NeedyEntity editNeedyDetails(int id);
	public NeedyEntity updateNeedy(NeedyBean needBean);

}
