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
import com.practice.webapp.entity.Admin;


@Controller
public class AdminController {
	
	
	@RequestMapping(value = "/adminlogin", method = RequestMethod.POST)
	public ModelAndView adminLogin(@ModelAttribute Admin admin) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("spring-module.xml");
		ModelAndView model = new ModelAndView("redirect:/product");
		//you can modify this part to check username and password with DB, AD, LDAP, or open id
		if ("admin".equals(admin.getUsername()) && "admin".equals(admin.getPassword())){
			//save username and password in the session bean
			Admin admin_session = (Admin)context.getBean("admin");
			admin_session.setUsername(admin.getUsername());
			admin_session.setPassword(admin.getPassword());
			System.out.println("Successful!");
		}
		else{
			model = new ModelAndView("admin");
			model.addObject("message", "登入失敗");
			System.out.println("failed!");
			//reset username and password in the session bean
			Admin admin_session = (Admin)context.getBean("admin");
			admin_session.setUsername("");
			admin_session.setPassword("");
		}	

		return model;
	}
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public ModelAndView Admin(Examinee examinee) {
		ModelAndView view = new ModelAndView("admin");
		return view;
	}
	
	

}
