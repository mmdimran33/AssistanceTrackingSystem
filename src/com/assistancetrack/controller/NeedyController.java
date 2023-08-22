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

import com.assistancetrack.bean.NeedyBean;
import com.assistancetrack.dao.NeedyDao;
import com.assistancetrack.model.NeedyEntity;

@Controller
public class NeedyController {
	String actionMessage = null;
	@Autowired
	NeedyDao needyObj;
	@RequestMapping(value = "/addNeedy", method = RequestMethod.GET)
	 public ModelAndView saveNeedy(@ModelAttribute("needyForm") NeedyBean needBean,
			BindingResult result) {
		System.out.println("saveNeedy invoked!!!!!!!!");
		return new ModelAndView("needy");
	}
	@RequestMapping(value = "/needy1", method = RequestMethod.POST)
	 public ModelAndView saveNeedyInDB(@ModelAttribute("needyForm") NeedyBean needBean,
			BindingResult result,Model model) {
		Integer saveFlag=needyObj.addNeedy(needBean);
		model.addAttribute("actionMessage", saveFlag>0?"Needy added Sucessfully":"Needy not added Sucessfully");
	    //return new ModelAndView("redirect:/displayNeedy.html");
		return new ModelAndView("needyMessage");
	}
	
	@RequestMapping(value = "/displayNeedy.html", method = RequestMethod.GET)
	public ModelAndView displayNeedyInDB(@ModelAttribute("needyForm") NeedyEntity  needBean,
			BindingResult result,Model model) {
		List<Object[]> needylist= needyObj.displayNeedy(needBean);
		model.addAttribute("needylist", needylist);
		System.out.println("displayNeedy invoked!!!!!!!!");
		return new ModelAndView("displayNeedy");	
	} 
	
	@RequestMapping(value = "/editNeedy/{needyId}/edit", method = RequestMethod.GET)
	public ModelAndView editNeedy(@PathVariable("needyId") int id,Model model) {
		System.out.println("id@@@@@" + id);
		NeedyEntity needEnt =this.needyObj.editNeedyDetails(id);
		NeedyBean needBean =new NeedyBean();
		System.out.println("getNeedyId@@@@"+needEnt.getNeedyId());
		System.out.println("needEnt@@@@"+needEnt.getName());
		needBean.setNeedyID(needEnt.getNeedyId());
		needBean.setNeedyName(needEnt.getName());
		needBean.setNeedyLastName(needEnt.getLName());
		needBean.setNeedyMobileNoFirst(needEnt.getMobileFirst());
		needBean.setNeedyMobileNoSecond(needEnt.getMobileSecond());
		needBean.setNeedyProfession(needEnt.getProfession());
		needBean.setNeedyAddress(needEnt.getAddress());
		needBean.setNeedyReasonProblem(needEnt.getReasonProblem());
		needBean.setNeedyReasonDetails(needEnt.getNeedyReasonDetails());
		needBean.setNeedyAmountAlotted(needEnt.getAmountAlotted());
		needBean.setNeedyRefName(needEnt.getRefName());
		needBean.setNeedyRefMobileNoFirst(needEnt.getRefMobileFirst());
		needBean.setNeedyRelationWithNeedy(needEnt.getRelationWithNeedy());
		model.addAttribute("needyForm", needBean);
		System.out.println("edit needy field fetched records");
		return new ModelAndView("editNeedy");
	}
	
	@RequestMapping(value ="/editNeedy1/update", method = RequestMethod.POST) 
	public ModelAndView saveEditNeedy(@ModelAttribute("needyForm") NeedyBean needBean ,Model model) 
	 {
		
		NeedyEntity editFlag = needyObj.updateNeedy(needBean);
		model.addAttribute("actionMessage", editFlag!=  null ? "Needy updated Sucessfully" : "Needy not updated Sucessfully");

		System.out.println("editFlag!!!!"+editFlag.toString());
		//return new ModelAndView("redirect:/displayNeedy.html");
		return new ModelAndView("needyMessage"); 
	 }
}
