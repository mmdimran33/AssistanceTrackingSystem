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

import com.assistancetrack.bean.DeliverBean;
import com.assistancetrack.dao.DeliverDao;
import com.assistancetrack.model.Deliever;
@Controller
public class DeliverController {
	@Autowired
	DeliverDao deliverDao;
	@Autowired
	Deliever deliverObj;
	String actionMessage=null;
	@RequestMapping(value = "/deliver", method = RequestMethod.GET)
	public ModelAndView saveDeliver(@ModelAttribute("deliverPaymentsForm") DeliverBean deliverBean, 
			BindingResult result,Model model) {
		List<String> needyIdList=deliverDao.getNeedyIdList();
		model.addAttribute("needyIdList", needyIdList);
		return new ModelAndView("deliver");
	} 
	@RequestMapping(value = "/deliver1", method = RequestMethod.POST)
	public ModelAndView saveDeliverPayInDB(@ModelAttribute("deliverPaymentsForm") DeliverBean deliverBean, 
			BindingResult result,Model model) {
		Integer saveFlag=deliverDao.deliverSavePay(deliverBean);
		model.addAttribute("actionMessage", saveFlag>0?"Deliver added Sucessfully":"Deliver not added Sucessfully");
		System.out.println("!!!!!!invoked DeliverController+++++++++++ ");
		return new ModelAndView("deliver");
	} 
}
