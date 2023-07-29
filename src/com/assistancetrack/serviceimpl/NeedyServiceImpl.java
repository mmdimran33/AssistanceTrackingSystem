package com.assistancetrack.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assistancetrack.bean.NeedyBean;
import com.assistancetrack.dao.NeedyDao;
import com.assistancetrack.model.NeedyEntity;
import com.assistancetrack.service.NeedyService;

@Service
public class NeedyServiceImpl implements NeedyService {
	
	@Autowired
	private NeedyDao needyDao;

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public Integer addNeedy(NeedyBean needyBean) {
		int needyStatus=0;
		if(!"".equals(needyBean.getNeedyName())&& !"".equals(needyBean.getNeedyLastName())
	    	&& !"".equals(needyBean.getNeedyMobileNoFirst()) && !"".equals(needyBean.getNeedyProfession())
			&& !"".equals(needyBean.getNeedyAddress()) && !"".equals(needyBean.getNeedyAmountAlotted())&&
			!"".equals(needyBean.getNeedyProfession()) && !"".equals(needyBean.getNeedyRefName())
			&& !"".equals(needyBean.getNeedyRefMobileNoFirst()) && !"".equals(needyBean.getNeedyRelationWithNeedy())) {		
	
		needyStatus=this.needyDao.addNeedy(needyBean);
		}
		
		return needyStatus;
	}

	@Override
	public List<Object[]> displayNeedy(NeedyEntity needyObj) {

		return this.needyDao.displayNeedy(needyObj);
	}

	@Override
	public NeedyEntity editNeedyDetails(int id) {

		return this.needyDao.editNeedyDetails(id);
	}

	@Override
	public NeedyEntity updateNeedy(NeedyBean needBean) {

		return this.needyDao.updateNeedy(needBean);
	}

}
