package com.assistancetrack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.assistancetrack.dao.DeliverDaoImpl;
import com.assistancetrack.model.Deliever;
@Controller
public class YearlySettlementController {
	@Autowired
	DeliverDaoImpl deleiverImplObj;
	@RequestMapping(value = "/yearlySettlement", method = RequestMethod.GET)
	public ModelAndView displayRecieverInDB(@ModelAttribute("yearlySettlementForm") Deliever yearlySettlement, 
			BindingResult result,Model model) {
		System.out.println("before invokred YearlySettlementController"+yearlySettlement.getDelieverDate());
		List<Object[]> delieverList = deleiverImplObj.yearlySettlementDisplay(yearlySettlement);
		model.addAttribute("delieverList", delieverList);
		System.out.println("after invokred YearlySettlementController");
		return new ModelAndView("yearlysettlement");
	} 
}
