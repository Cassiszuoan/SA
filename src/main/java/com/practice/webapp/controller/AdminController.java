package com.practice.webapp.controller;
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
import com.practice.webapp.dao.ApplyDAO;
import com.practice.webapp.entity.TestRoom;
import com.practice.webapp.entity.Examinee;


@Controller
public class AdminController {
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public ModelAndView Admin(Examinee examinee) {
		ModelAndView view = new ModelAndView("admin");
		return view;
	}

}
