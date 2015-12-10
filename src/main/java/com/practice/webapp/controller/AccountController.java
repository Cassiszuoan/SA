package com.practice.webapp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.practice.webapp.entity.Examinee;

@Controller
public class AccountController {
	ApplicationContext context =  new ClassPathXmlApplicationContext("spring-module.xml");
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView checkLogin(Examinee examinee) {
		ModelAndView view = new ModelAndView("redirect:/signin");
		//you can modify this part to check username and password with DB, AD, LDAP, or open id
		
		
		if ("sa".equals(examinee.getID()) && "ilovesa".equals(examinee.getPassword())){
			//save username and password in the session bean
			Examinee examinee_session = (Examinee)context.getBean("examinee");
			examinee_session.setID(examinee.getID());
			examinee_session.setPassword(examinee.getPassword());
			System.out.println("Successful!");
		}
		else{
			view = new ModelAndView("signin");
			view.addObject("message", "登入失敗");
			System.out.println("failed!");
			//reset username and password in the session bean
			Examinee examinee_session = (Examinee)context.getBean("account");
			examinee_session.setID("");
			examinee_session.setPassword("");
		}	

		return view;
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(Examinee examinee) {
		ModelAndView view = new ModelAndView("signin");
		return view;
	}
}
