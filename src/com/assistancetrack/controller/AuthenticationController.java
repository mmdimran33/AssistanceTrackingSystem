package com.assistancetrack.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.assistancetrack.bean.AuthenticationBean;
import com.assistancetrack.bean.DashBoardBean;
import com.assistancetrack.dao.AuthenticationDaoImpl;
import com.assistancetrack.dao.DashBoardDao;

@Controller
public class AuthenticationController {
	@Autowired
	DashBoardDao dashBoardDao;
	@Autowired
	AuthenticationDaoImpl auothenticInstance;
	boolean userStatus = false;
	String userMessage = null;
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView userAuthentic(@ModelAttribute("loginForm") AuthenticationBean authenticBean, 
			BindingResult result) {
		System.out.println("!!!!!!!!!!!Contrller1!!!!!!!!!!!!!");
		return new ModelAndView("login");
	} 
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView dashBoard(@ModelAttribute("dashBoradForm") DashBoardBean dashBoardBean, 
			BindingResult result,Model model) {
		List<Object[]> dashBoardList=dashBoardDao.displayDashBoard();
		model.addAttribute("dashBoardList", dashBoardList);
		System.out.println("!!!!!!!!!!!dashBoard Contrller!!!!!!!!!!!!!");
		return new ModelAndView("index");
	} 
	
	@RequestMapping(value = "/login1", method = RequestMethod.POST)
	public ModelAndView userAuthenticInDB(@ModelAttribute("loginForm") AuthenticationBean addMemberBean, 
			BindingResult result,@RequestParam(value="userName")String uName,@RequestParam(value="userPassword")
			String userPassword,Model model,HttpSession session) {
		System.out.println("!!!!!!!!!!!Contrller2!!!!!!!!!!!!!");
		System.out.println("!!!!!!!!!!!UserName!!!!!!!!!!!!!"+uName);
		System.out.println("!!!!!!!!!!!Password!!!!!!!!!!!!!"+userPassword);
		if(!uName.isEmpty() && !userPassword.isEmpty()) {
			userStatus = auothenticInstance.userAuthentication(uName, userPassword);
			if(userStatus){
				userStatus= true;
				session.setAttribute("uName", uName);
				Date creationTime = new Date(session.getCreationTime());
				session.setAttribute("creationTime", creationTime);
				Date lastAccessTime = new Date(session.getLastAccessedTime());
				session.setAttribute("lastAccessTime", lastAccessTime);
				System.out.println("******* userStatus controller sucessfully*********:"+ userStatus);
				List<Object[]> dashBoardList=dashBoardDao.displayDashBoard();
				model.addAttribute("dashBoardList", dashBoardList);
				System.out.println("!!!!!!!!!!!inside user Authentic Contrller!!!!!!!!!!!!!");
				return new ModelAndView("index");
			}else{
				userStatus= false;
				System.out.println("******* not userStatus controller sucessfully*********:"+ userStatus);
			}	
		}
			model.addAttribute("userMessage", "User Id and password are invalid!");
			return new ModelAndView("login");
	} 
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView userLogout(HttpSession session, 
			BindingResult result, Object bindingResult) {
		System.out.println("!!!!!!!!!!!Seesion1111 false!!!!!!!!!!!!!");
		session.invalidate();
		System.out.println("!!!!!!!!!!!Seesion false!!!!!!!!!!!!!");
		return new ModelAndView("login");
	} 
}

