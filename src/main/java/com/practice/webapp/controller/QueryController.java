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
		Examinee examinee_temp = (Examinee)context.getBean("examinee");
		RegisterDAO RegisterDAO = (RegisterDAO)context.getBean("RegisterDAO");
		RegisterDAO.getExaminee(examinee_temp);
		
		
		if(QueryDAO.ifExist(examinee)){
			
			//GSAT Query
			TestRoom GSATtestroom = QueryDAO.GSATtestRoomQuery(examinee).getTestRoom();
			GSATtestroom = QueryDAO.testRoomSetup(GSATtestroom);
			
			
			if(examinee_temp.getGSATscore().getId()==1){
				view.addObject("GSATwarning","尚未報考學測");
			}
			else{
				
				
				 if(QueryDAO.GSATtestnumberQuery(examinee)==100000000){
				    	view.addObject("GSATtestnumber","學測准考證尚未分配");
				    }
				    else{
					view.addObject("GSATtestnumber",QueryDAO.GSATtestnumberQuery(examinee));
				    }
			if(GSATtestroom.getId()==0){
				view.addObject("GSATid", "尚未分配考場");
			}
			else{
			view.addObject("GSATid", GSATtestroom.getId());
			view.addObject("GSATname",GSATtestroom.getName());
			view.addObject("GSATaddress",GSATtestroom.getAddress());
			}
			
			}
			// EL Query
			
			TestRoom ELtestroom = QueryDAO.ELtestRoomQuery(examinee).getTestRoom();
			GSATtestroom = QueryDAO.testRoomSetup(ELtestroom);
			if(examinee_temp.getELscore().getId()==1){
				view.addObject("ELwarning","尚未報考英聽");
			}
			else{
		    if(QueryDAO.ELtestnumberQuery(examinee)==300000000){
		    	view.addObject("ELtestnumber","英聽准考證尚未分配");
		    }
		    else{
			view.addObject("ELtestnumber",QueryDAO.ELtestnumberQuery(examinee));
		    }
			
			if(ELtestroom.getId()==0){
				view.addObject("ELid", "尚未分配考場");
			}
			else{
				
			
			view.addObject("ELid", ELtestroom.getId());
			view.addObject("ELname",ELtestroom.getName());
			view.addObject("ELaddress",ELtestroom.getAddress());
			}
			}
			//AST Query
			TestRoom ASTtestroom = QueryDAO.ASTtestRoomQuery(examinee).getTestRoom();
			ASTtestroom = QueryDAO.testRoomSetup(ASTtestroom);
			if(examinee_temp.getASTscore().getID()==1){
				view.addObject("ASTwarning","尚未報考指考");
			}
			else{
				 if(QueryDAO.ASTtestnumberQuery(examinee)==200000000){
				    	view.addObject("ASTtestnumber","指考准考證尚未分配");
				    }
				    else{
					view.addObject("ASTtestnumber",QueryDAO.ASTtestnumberQuery(examinee));
				    }
			if(ASTtestroom.getId()==0){
				view.addObject("ASTid", "尚未分配考場");
			}
			else{
			view.addObject("ASTid", ASTtestroom.getId());
			view.addObject("ASTname",ASTtestroom.getName());
			view.addObject("ASTaddress",ASTtestroom.getAddress());
			}
			}
			
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
