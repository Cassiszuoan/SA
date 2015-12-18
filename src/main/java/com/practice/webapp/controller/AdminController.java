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
import com.practice.webapp.dao.AdminDAO;
import com.practice.webapp.dao.ApplyDAO;
import com.practice.webapp.dao.ProductDAO;
import com.practice.webapp.entity.TestRoom;
import com.practice.webapp.entity.Examinee;
import com.practice.webapp.entity.Product;
import com.practice.webapp.entity.Admin;


@Controller
public class AdminController {
	
	ApplicationContext context =  new ClassPathXmlApplicationContext("spring-module.xml");
	@RequestMapping(value = "/adminlogin", method = RequestMethod.POST)
	public ModelAndView adminLogin(@ModelAttribute Admin admin) {
		
		ModelAndView model = new ModelAndView("redirect:/examineelist");
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
	
	
	@RequestMapping(value = "/examineelist", method = RequestMethod.GET)
	public ModelAndView getExamineeList(){
	
		ModelAndView model = new ModelAndView("examineelist");
		
		
		AdminDAO AdminDAO = (AdminDAO)context.getBean("AdminDAO");
		List<Examinee> ExamineeList = new ArrayList<Examinee>();
		ExamineeList = AdminDAO.getAllExamineeList();
		
		model.addObject("ExamineeList", ExamineeList);
		
		return model;
	}
	
	
	@RequestMapping(value = "/insertExaminee", method = RequestMethod.GET)
	public ModelAndView insertExamineePage(){
		ModelAndView model = new ModelAndView("insertExaminee");
		
		return model;
	}
	
	@RequestMapping(value = "/insertExaminee", method = RequestMethod.POST)
	public ModelAndView insertExaminee(@ModelAttribute Examinee examinee){
		ModelAndView model = new ModelAndView("redirect:/examineelist");
		RegisterDAO RegisterDAO = (RegisterDAO)context.getBean("RegisterDAO");
		RegisterDAO.register(examinee);
		
		return model;
	}
	
	
	@RequestMapping(value = "/updateExaminee", method = RequestMethod.GET)
	public ModelAndView updateExamineePage(@ModelAttribute Examinee examinee){
		ModelAndView model = new ModelAndView("updateExaminee");
		
		RegisterDAO RegisterDAO = (RegisterDAO)context.getBean("RegisterDAO");
		
		examinee = RegisterDAO.getExaminee(examinee);
		
		model.addObject("examinee", examinee);
		return model;
	}
	
	@RequestMapping(value = "/updateExaminee", method = RequestMethod.POST)
	public ModelAndView updateProduct(@ModelAttribute Examinee examinee){
		ModelAndView model = new ModelAndView("redirect:/examineeList");
		RegisterDAO RegisterDAO = (RegisterDAO)context.getBean("RegisterDAO");
		RegisterDAO.modify(examinee);
		return model;
	}

}
