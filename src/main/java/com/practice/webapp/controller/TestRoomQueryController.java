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
public class TestRoomQueryController {
	ApplicationContext context =  new ClassPathXmlApplicationContext("spring-module.xml");
	
	@RequestMapping(value = "/testroomquery", method = RequestMethod.POST)
	public ModelAndView testroomQuery(Examinee examinee){
		
		
		ModelAndView view = new ModelAndView("testroomquery");
		QueryDAO QueryDAO = (QueryDAO)context.getBean("QueryDAO");
		
		
		TestRoom testroom = QueryDAO.testRoomQuery(examinee).getTestRoom();
		QueryDAO.testRoomSetup(testroom);
		
		view.addObject("id", testroom.getId());
		view.addObject("name",testroom.getName());
		view.addObject("address",testroom.getAddress());
		
	
		
		return view;
	}
	
	@RequestMapping(value = "/testroomquery", method = RequestMethod.GET)
	public ModelAndView Query(){
		
		ModelAndView model = new ModelAndView("testroomquery");
	
		
		return model;
	}
}
