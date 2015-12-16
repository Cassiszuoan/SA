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
	public ModelAndView testnumberquery(Examinee examinee){
		
		
		ModelAndView view = new ModelAndView("testnumberquery");
		QueryDAO QueryDAO = (QueryDAO)context.getBean("QueryDAO");
		
		
		if(QueryDAO.ifExist(examinee)){
			
			//GSAT Query
			TestRoom GSATtestroom = QueryDAO.GSATtestRoomQuery(examinee).getTestRoom();
			GSATtestroom = QueryDAO.testRoomSetup(GSATtestroom);
			view.addObject("GSATtestnumber",QueryDAO.GSATtestnumberQuery(examinee));
			view.addObject("GSATid", GSATtestroom.getId());
			view.addObject("GSATname",GSATtestroom.getName());
			view.addObject("GSATaddress",GSATtestroom.getAddress());
			// EL Query
			TestRoom ELtestroom = QueryDAO.ELtestRoomQuery(examinee).getTestRoom();
			GSATtestroom = QueryDAO.testRoomSetup(ELtestroom);
			view.addObject("ELtestnumber",QueryDAO.ELtestnumberQuery(examinee));
			view.addObject("ELid", ELtestroom.getId());
			view.addObject("ELname",ELtestroom.getName());
			view.addObject("ELaddress",ELtestroom.getAddress());
			
			return view;
		}
		
		else{
			
			view.addObject("warning","資料不存在");
			return view;
		}
		
	}
	
	@RequestMapping(value = "/testnumberquery", method = RequestMethod.GET)
	public ModelAndView Query(){
		
		ModelAndView model = new ModelAndView("testnumberquery");
	
		
		return model;
	}

}
