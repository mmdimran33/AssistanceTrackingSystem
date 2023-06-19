package com.assistancetrack.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.assistancetrack.bean.AuthenticationBean;
import com.assistancetrack.dao.UserRegistrationDAO;

@Controller
public class UserRegisterController {
	@Autowired
	UserRegistrationDAO userRegister;
	String actionMessage = null;
	@RequestMapping(value = "/userregister", method = RequestMethod.GET)
	public ModelAndView userRegisterLoadPage(@ModelAttribute("userForm") AuthenticationBean authenticBean, 
			BindingResult result) {
		System.out.println("!!!!!!!!!!!User Controller!!!!!!!!!!!!!");
		return new ModelAndView("userregister");
	} 
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public ModelAndView saveUserInDB(@ModelAttribute("userForm") AuthenticationBean authenticBean, 
			BindingResult result,Model model) {
		int saveFlag=userRegister.saveUserRegistration(authenticBean);
		model.addAttribute("actionMessage", saveFlag>0? "User has been Register Successfully": "User has not been Register Successfully");
		System.out.println("!!!!!!!!!!!User Controller!!!!!!!!!!!!!");
		//return new ModelAndView("redirect:/login.html");
		return new ModelAndView("registerMsg");
	}
}
