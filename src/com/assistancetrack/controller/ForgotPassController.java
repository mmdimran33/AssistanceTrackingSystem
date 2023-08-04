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
import com.assistancetrack.dao.ForgotPassDao;
import com.assistancetrack.service.ForgotPassService;

@Controller
public class ForgotPassController {
	int status = 0;
	String actionMessage = null;
	@Autowired
	private ForgotPassService forgotPassDao;

	@RequestMapping(value = "/forgotpass", method = RequestMethod.GET)
	public ModelAndView forgotPassLoadPage(@ModelAttribute("forgotPassForm") AuthenticationBean authenticBean,
			BindingResult result) {
		System.out.println("!!!!!!!!!!!User Forgot Password Controller!!!!!!!!!!!!!");
		return new ModelAndView("forgotpass");
	}

	@RequestMapping(value = "/forgotpassword1", method = RequestMethod.POST)
	public ModelAndView forgotPassUpdate(@ModelAttribute("forgotPassForm") AuthenticationBean authenticBean,
			BindingResult result, Model model) {
		status = forgotPassDao.forgotPassword(authenticBean);
		System.out.println("!!!!!!!!!!!pass changed Succefullyyyyyyyy !!!!!!!!!!!!!" + status);
		model.addAttribute("actionMessage",
				status == 0 ? "Password has been Changed Successfully" : "User has not been Register Successfully");
		System.out.println("!!!!!!!!!!!User Forgot Password Controller in database !!!!!!!!!!!!!");
		return new ModelAndView("registerMsg");
	}

}
