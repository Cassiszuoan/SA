package com.practice.webapp.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.practice.webapp.dao.RegisterDAO;

import com.practice.webapp.entity.Examinee;

public class RegisterController {
	
	ApplicationContext context =  new ClassPathXmlApplicationContext("spring-module.xml");
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView Register( Examinee examinee){
		ModelAndView view = new ModelAndView("redirect:/signin");
		Examinee examinee1 = new Examinee();
		RegisterDAO RegisterDAO = (RegisterDAO)context.getBean("RegisterDAO");
		RegisterDAO.register(examinee1);
		
		return view;
	}

}
