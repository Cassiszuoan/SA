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
import com.practice.webapp.dao.QueryDAO;
import com.practice.webapp.dao.TestRoomDAO;
import com.practice.webapp.entity.TestRoom;
import com.practice.webapp.entity.Examinee;



@Controller

public class RegisterController {
	
	ApplicationContext context =  new ClassPathXmlApplicationContext("spring-module.xml");
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView Register(Examinee examinee){
		
		
		ModelAndView view = new ModelAndView("/signin");
		RegisterDAO RegisterDAO = (RegisterDAO)context.getBean("RegisterDAO");
		
	    RegisterDAO.register(examinee);
	
		
		return view;
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView RegisterTestRoomList(){
		ModelAndView view = new ModelAndView("register");
		TestRoomDAO TestRoomDAO = (TestRoomDAO)context.getBean("TestRoomDAO");
		List<TestRoom> TestRoomList = new ArrayList<TestRoom>();
		TestRoomList = TestRoomDAO.getTestRoomList();
		view.addObject("TestRoomList", TestRoomList);
		System.out.println("Here>> "+TestRoomList.toString());
		return view;
	}
	
	
	
	
	
//
//	@RequestMapping(value = "/register", method = RequestMethod.GET)
//	public ModelAndView register(Examinee examinee) {
//		ModelAndView view = new ModelAndView("register");
//		return view;
//	}

}
