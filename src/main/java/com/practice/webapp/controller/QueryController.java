package com.practice.webapp.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.practice.webapp.dao.RegisterDAO;
import com.practice.webapp.dao.ProductDAO;
import com.practice.webapp.dao.QueryDAO;
import com.practice.webapp.entity.Examinee;
import com.practice.webapp.entity.TestRoom;

@Controller
public class QueryController {
	
	ApplicationContext context =  new ClassPathXmlApplicationContext("spring-module.xml");
	
	

	
	@RequestMapping(value = "/testnumberquery", method = RequestMethod.POST)
	public ModelAndView Register(Examinee examinee){
		
		
		ModelAndView view = new ModelAndView("testnumberquery");
		QueryDAO QueryDAO = (QueryDAO)context.getBean("QueryDAO");
		
		Examinee examinee_session = (Examinee)context.getBean("examinee");
		examinee_session.setEmail(examinee.getID());
		examinee_session.setPassword(examinee.getPassword());
		
		QueryDAO.testNumberQuery(examinee_session);
		view.addObject("message", examinee_session.getTestNumber());
		
	
		
		return view;
	}
	
	@RequestMapping(value = "/testnumberquery", method = RequestMethod.GET)
	public ModelAndView Query(){
		
		ModelAndView model = new ModelAndView("testnumberquery");
	
		
		return model;
	}

}
