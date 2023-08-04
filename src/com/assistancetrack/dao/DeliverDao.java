package com.assistancetrack.dao;

import java.util.List;

import com.assistancetrack.bean.DeliverBean;
import com.assistancetrack.model.Deliever;

public interface DeliverDao {
	public Integer deliverSavePay(DeliverBean delieverBean);

	public List<Object[]> yearlySettlementDisplay(Deliever delieverModelEntity);

	public List<String> getNeedyIdList();
//public List<String>getNeedyIdList();
}
