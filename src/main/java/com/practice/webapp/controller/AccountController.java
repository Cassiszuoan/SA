package com.practice.webapp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.practice.webapp.entity.Account;

@Controller
public class AccountController {
	ApplicationContext context =  new ClassPathXmlApplicationContext("spring-module.xml");
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView checkLogin(@ModelAttribute Account account) {
		ModelAndView view = new ModelAndView("redirect:/product");
		//you can modify this part to check username and password with DB, AD, LDAP, or open id
		if ("sa".equals(account.getUsername()) && "ilovesa".equals(account.getPassword())){
			//save username and password in the session bean
			Account account_session = (Account)context.getBean("account");
			account_session.setUsername(account.getUsername());
			account_session.setPassword(account.getPassword());
			System.out.println("Successful!");
		}
		else{
			view = new ModelAndView("signin");
			view.addObject("message", "登入失敗");
			System.out.println("failed!");
			//reset username and password in the session bean
			Account account_session = (Account)context.getBean("account");
			account_session.setUsername("");
			account_session.setPassword("");
		}	

		return view;
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(@ModelAttribute Account account) {
		ModelAndView view = new ModelAndView("signin");
		return view;
	}
}
