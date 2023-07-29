package com.assistancetrack.service;

import java.util.List;

import com.assistancetrack.bean.DeliverBean;
import com.assistancetrack.model.Deliever;

public interface DeliverService {
	public Integer deliverSavePay(DeliverBean delieverBean);

	public List<Object[]> yearlySettlementDisplay(Deliever delieverModelEntity);

	public List<String> getNeedyIdList();

}
