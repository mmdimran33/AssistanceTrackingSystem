package com.assistancetrack.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.Response;

import org.apache.catalina.connector.Request;
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
import com.assistancetrack.dao.AddMemberDao;
import com.assistancetrack.model.AddMember;
import com.assistancetrack.service.AddMemberService;

@Controller
public class AddMemberController {
	String actionMessage = null;
	private String msg="";
	
	@Autowired
	private AddMemberService service;
	//AddMemberService service;
	//AddMemberDao memberDao;
	
//	@Autowired
//	private AddMemberService addMemberService;

	@RequestMapping(value = "/addMember", method = RequestMethod.GET)
	public ModelAndView saveMember(@ModelAttribute("memberForm") AddMemberBean addMemberBean, BindingResult result) {
		return new ModelAndView("member");
	}

	@RequestMapping(value = "/addMember1", method = RequestMethod.POST)
	public ModelAndView saveMemberInDB(@ModelAttribute("memberForm") AddMemberBean addMemberBean, BindingResult result,
			Model model) {
		int saveFlag = (Integer) service.addMemberDetails(addMemberBean);
		model.addAttribute("actionMessage", saveFlag > 0 ? "Member added Sucessfully" : "Member not added Sucessfully");
		System.out.println("actionMessage Controller!!!!!!!!!!!!" + actionMessage);
		//msg="Sucess";
		//return new ModelAndView("redirect:/displayMember.html");
		return new ModelAndView("message");
		}
	
/*	@RequestMapping(value = "/message", method = RequestMethod.POST)
	public ModelAndView displayMessage(@ModelAttribute("memberForm") AddMemberBean addMemberBean, BindingResult result,
			Model model) {
//		int saveFlag = (Integer) memberDao.addMemberDetails(addMemberBean);
//		model.addAttribute("actionMessage", saveFlag > 0 ? "Member added Sucessfully" : "Member not added Sucessfully");
		System.out.println("actionMessage Controller!!!!!!!!!!!!" + actionMessage);
		return new ModelAndView("redirect:/displayMember.html");
	}*/
	

	
	@RequestMapping(value = "/editMember/{memberId}/edit", method = RequestMethod.GET)
	public ModelAndView editMember(@PathVariable("memberId") int id,Model model) {
		System.out.println("id@@@@@" + id);
		  
		
		AddMember amb =this.service.editMemberDetails(id);
		AddMemberBean memberBean =new AddMemberBean();
		memberBean.setMemberId(amb.getMemberId());
		memberBean.setNikeName(amb.getMemberNikeName());
		memberBean.setfName(amb.getMemberFName());
		memberBean.setlName(amb.getMemberLName());
		memberBean.setFirstContact(amb.getMemberFirstContact());
		memberBean.setProfession(amb.getMemberProfession());//Added By Tauqeer
		memberBean.setSecondContact(amb.getMemberSecondContact());
		memberBean.setAddress(amb.getMemberAddress());
		model.addAttribute("memberForm", memberBean);
		
		System.out.println("edit member field fetched records");
		return new ModelAndView("editMember");
	}
	 
	@RequestMapping(value ="/editMember1/update", method = RequestMethod.POST) 
	public ModelAndView editSaveMember(@ModelAttribute("memberForm") AddMemberBean addMemberBean ,Model model) 
	 {
		
		int editFlag = (Integer) service.editsaveMemberDetails(addMemberBean);
		System.out.println("editFlag!!!!!!!!!!!!" + editFlag);
		model.addAttribute("actionMessage", editFlag > 0 ? "Member updated Sucessfully" : "Member not updated Sucessfully");
		//return new ModelAndView("redirect:/displayMember.html");
	  
		return new ModelAndView("message");
	 }

	@RequestMapping(value = "/displayMember", method = RequestMethod.GET)
	public ModelAndView displayMember(@ModelAttribute("memberForm") AddMember displayAddMember, BindingResult result,
			Model model) {
		List<AddMember> memberLists = service.displayMemberDetails(displayAddMember);
		System.out.println("displayMember controller without DB invoked!!!!!!!!!!!!!!!!!!!!!!");
		model.addAttribute("memberLists", memberLists);
		return new ModelAndView("displaymember");
	}

}
