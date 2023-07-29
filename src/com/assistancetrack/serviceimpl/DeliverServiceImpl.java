package com.assistancetrack.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assistancetrack.bean.DeliverBean;
import com.assistancetrack.dao.DeliverDao;
import com.assistancetrack.model.Deliever;
import com.assistancetrack.service.DeliverService;

@Service
public class DeliverServiceImpl implements DeliverService {
	
	@Autowired
	private DeliverDao deliverDao;

	@Override
	public Integer deliverSavePay(DeliverBean delieverBean) {
		
		return this.deliverDao.deliverSavePay(delieverBean);
	}

	@Override
	public List<Object[]> yearlySettlementDisplay(Deliever delieverModelEntity) {
	
		return this.deliverDao.yearlySettlementDisplay(delieverModelEntity);
	}

	@Override
	public List<String> getNeedyIdList() {
	
		return this.deliverDao.getNeedyIdList();
	}

	

}
