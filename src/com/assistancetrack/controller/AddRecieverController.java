package com.assistancetrack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.assistancetrack.bean.AddMemberBean;
import com.assistancetrack.bean.RecieverBean;
import com.assistancetrack.dao.RecieverDao;
import com.assistancetrack.dao.RecieverDaoImpl;
import com.assistancetrack.model.AddMember;
import com.assistancetrack.model.Reciever;
@Controller
public class AddRecieverController {
	String actionMessage = null;
	@Autowired
	RecieverDao recieverObj;
	@RequestMapping(value = "/addReciever", method = RequestMethod.GET)
	public ModelAndView saveReciever(@ModelAttribute("recieverForm") RecieverBean receiverBean, 
			BindingResult result,Model model) {
		List <String> nickNameList=recieverObj.getNickNameList();
		model.addAttribute("nickNameList",nickNameList);
		return new ModelAndView("receiver");
	} 
	@RequestMapping(value = "/addReciever1", method = RequestMethod.POST)
	public ModelAndView saveRecieverInDB(@ModelAttribute("recieverForm") RecieverBean receiverBean, 
			BindingResult result,Model model) {
		int saveFlag=(Integer)recieverObj.addRecieverDetails(receiverBean);
		model.addAttribute("actionMessage", saveFlag>0?"Receiver added Sucessfully":"Receiver not added Sucessfully");
		return new ModelAndView("receiverMessage");
	} 
	
	@RequestMapping(value = "/displayReciever", method = RequestMethod.GET)
	public ModelAndView displayRecieverInDB(@ModelAttribute("recieverForm") Reciever receiverEntity, 
			BindingResult result,Model model) {
		List<Object[]> displayRecieverList = recieverObj.displayReciever(receiverEntity);
		model.addAttribute("recieverList",displayRecieverList);
		return new ModelAndView("displayreceiver");
	} 
	
	@RequestMapping(value = "/receiverlist/{receiverlist}/receiverlist", method = RequestMethod.GET)
	public ModelAndView displayListReceiver(@PathVariable("receiverlist") String rid,Model model) {
		
		System.out.println("id@@@@@" + rid);
		  
		List<Object[]> displayDetailsRecieverList = recieverObj.displayRecieverList(rid);
		model.addAttribute("recieverDetailsList",displayDetailsRecieverList);
		return new ModelAndView("receiverList");
	}
	@RequestMapping(value = "/receiveredit/{receiveredit}/receiveredit", method = RequestMethod.GET)
	public ModelAndView receiverEdit(@PathVariable("receiveredit") int rid,Model model) {
		
		System.out.println("id@@@@@" + rid);
		
		Reciever amb =this.recieverObj.receiverEdit(rid);
		RecieverBean rBean =new RecieverBean();
		rBean.setNickName(amb.getRnickName());
		rBean.setAmount(amb.getRamount());
		rBean.setCreatedDate(amb.getRreceivedate());
		rBean.setRrecieverId(amb.getRrecieverId());
		model.addAttribute("recieverForm", rBean);
		System.out.println("edit member field fetched records");
		return new ModelAndView("editReceiver");
	}
	
	@RequestMapping(value ="/receiveredit1/update", method = RequestMethod.POST) 
	public ModelAndView editSaveMember(@ModelAttribute("recieverForm") RecieverBean recieverBean,Model model) 
	 {
		
		int editFlag =  recieverObj.editsaveRecDet(recieverBean);
		System.out.println("editFlag!!!!!!!!!!!!" + editFlag);
		model.addAttribute("actionMessage", editFlag > 0 ? "Receiver updated Sucessfully" : "Receiver not updated Sucessfully");
		//return new ModelAndView("redirect:/displayReciever.html");
		
		return new ModelAndView("receiverMessage");
	 }
	
}
