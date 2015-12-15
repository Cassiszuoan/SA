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
public class ApplyController {
	
	
	ApplicationContext context =  new ClassPathXmlApplicationContext("spring-module.xml");

	
	
	@RequestMapping(value = "/apply", method = RequestMethod.GET)
	public ModelAndView Apply(Examinee examinee){
		ModelAndView view = new ModelAndView("apply");
		RegisterDAO RegisterDAO = (RegisterDAO)context.getBean("RegisterDAO");
		Examinee examinee_session = (Examinee)context.getBean("examinee");
		RegisterDAO.getExaminee(examinee_session);
		view.addObject("message", examinee_session.getName());
		
		return view;
		
	
	}
}
