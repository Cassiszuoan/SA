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
import com.practice.webapp.dao.AdminDAO;
import com.practice.webapp.dao.ProductDAO;
import com.practice.webapp.dao.QueryDAO;
import com.practice.webapp.entity.ASTscore;
import com.practice.webapp.entity.ELscore;
import com.practice.webapp.entity.Examinee;
import com.practice.webapp.entity.TestRoom;
import com.practice.webapp.entity.GSATscore;

@Controller
public class QueryController {
	
	ApplicationContext context =  new ClassPathXmlApplicationContext("spring-module.xml");
	
	

	
	@RequestMapping(value = "/testnumberquery", method = RequestMethod.POST)
	public ModelAndView testnumberquery(Examinee examinee){
		
		
		ModelAndView view = new ModelAndView("testnumberquery");
		QueryDAO QueryDAO = (QueryDAO)context.getBean("QueryDAO");
		Examinee examinee_temp = (Examinee)context.getBean("examinee");
		RegisterDAO RegisterDAO = (RegisterDAO)context.getBean("RegisterDAO");
		AdminDAO AdminDAO = (AdminDAO)context.getBean("AdminDAO");
		RegisterDAO.getExaminee(examinee_temp);
		if(QueryDAO.ifExist(examinee)){
		AdminDAO.get(examinee);
		view.addObject("name",examinee.getName());
		view.addObject("id",examinee.getID());
		view.addObject("emermobile",examinee.getEmergencyContactMobile());
		ArrayList<String> list = (ArrayList<String>) examinee.getSubject();
		String subjectlist = "";
		for(String s: list)
		{
			subjectlist+=s + "\t";
		}
		
		view.addObject("subject",subjectlist);
		
		
			
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
				view.addObject("GSATname", "尚未分配考場");
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
				view.addObject("ELname", "尚未分配考場");
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
				view.addObject("ASTname", "尚未分配考場");
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
	
	@RequestMapping(value = "/scorequery", method = RequestMethod.POST)
	public ModelAndView scoreQuery(Examinee examinee){
		
		ModelAndView model = new ModelAndView("scorequery");
		QueryDAO QueryDAO = (QueryDAO)context.getBean("QueryDAO");
		Examinee examinee_temp = (Examinee)context.getBean("examinee");
		RegisterDAO RegisterDAO = (RegisterDAO)context.getBean("RegisterDAO");
		RegisterDAO.getExaminee(examinee_temp);
		AdminDAO AdminDAO = (AdminDAO)context.getBean("AdminDAO");
		if(QueryDAO.ifExist(examinee)){
		AdminDAO.get(examinee);
		model.addObject("name",examinee.getName());
		model.addObject("id",examinee.getID());
		model.addObject("emermobile",examinee.getEmergencyContactMobile());
		ArrayList<String> list = (ArrayList<String>) examinee.getSubject();
		String subjectlist = "";
		for(String s: list)
		{
			subjectlist+=s + "\t";
		}
		
		model.addObject("subject",subjectlist);
		
		
		
		
		
		

			
			//GSAT Query
			TestRoom GSATtestroom = QueryDAO.GSATtestRoomQuery(examinee).getTestRoom();
			
			GSATtestroom = QueryDAO.testRoomSetup(GSATtestroom);
			
			
			
			if(examinee_temp.getGSATscore().getId()==1){
				model.addObject("GSATwarning","尚未報考學測");
			}
			else{
				
				
				 if(QueryDAO.GSATtestnumberQuery(examinee)==100000000){
				    	model.addObject("GSATtestnumber","學測准考證尚未分配");
				    }
				    else{
					model.addObject("GSATtestnumber",QueryDAO.GSATtestnumberQuery(examinee));
				    }
			if(GSATtestroom.getId()==0){
				model.addObject("GSATname", "尚未分配考場");
			}
			else{
				
				QueryDAO.GSATScoreQuery(examinee_temp);
		        QueryDAO.GSATScoreSetup(examinee_temp.getGSATscore());
		        GSATscore GSATscore = examinee_temp.getGSATscore();
		        System.out.println("國文： "+GSATscore.getChinese());
		        model.addObject("GSATscore",GSATscore);
			
			model.addObject("GSATid", GSATtestroom.getId());
			model.addObject("GSATname",GSATtestroom.getName());
			model.addObject("GSATaddress",GSATtestroom.getAddress());
			}
			
			}
			// EL Query
			
			TestRoom ELtestroom = QueryDAO.ELtestRoomQuery(examinee).getTestRoom();
			GSATtestroom = QueryDAO.testRoomSetup(ELtestroom);
			if(examinee_temp.getELscore().getId()==1){
				model.addObject("ELwarning","尚未報考英聽");
			}
			else{
		    if(QueryDAO.ELtestnumberQuery(examinee)==300000000){
		    	model.addObject("ELtestnumber","英聽准考證尚未分配");
		    }
		    else{
			model.addObject("ELtestnumber",QueryDAO.ELtestnumberQuery(examinee));
		    }
			
			if(ELtestroom.getId()==0){
				model.addObject("ELname", "尚未分配考場");
			}
			else{
				
				QueryDAO.ELScoreQuery(examinee_temp);
		        QueryDAO.ELScoreSetup(examinee_temp.getELscore());
		        ELscore ELscore = examinee_temp.getELscore();
		        System.out.println("英聽成績： "+ELscore.getScore());
		        model.addObject("ELscore",ELscore);
			model.addObject("ELid", ELtestroom.getId());
			model.addObject("ELname",ELtestroom.getName());
			model.addObject("ELaddress",ELtestroom.getAddress());
			}
			}
			//AST Query
			TestRoom ASTtestroom = QueryDAO.ASTtestRoomQuery(examinee).getTestRoom();
			ASTtestroom = QueryDAO.testRoomSetup(ASTtestroom);
			if(examinee_temp.getASTscore().getID()==1){
				model.addObject("ASTwarning","尚未報考指考");
			}
			else{
				 if(QueryDAO.ASTtestnumberQuery(examinee)==200000000){
				    	model.addObject("ASTtestnumber","指考准考證尚未分配");
				    }
				    else{
					model.addObject("ASTtestnumber",QueryDAO.ASTtestnumberQuery(examinee));
				    }
			if(ASTtestroom.getId()==0){
				model.addObject("ASTname", "尚未分配考場");
			}
			else{
				
				 QueryDAO.ASTScoreQuery(examinee_temp);
			        QueryDAO.ASTScoreSetup(examinee_temp.getASTscore());
			        ASTscore ASTscore = examinee_temp.getASTscore();
			        System.out.println("指考國文成績： "+ASTscore.getChinese());
			        model.addObject("ASTscore",ASTscore);
			        
			model.addObject("ASTid", ASTtestroom.getId());
			model.addObject("ASTname",ASTtestroom.getName());
			model.addObject("ASTaddress",ASTtestroom.getAddress());
			}
			}
			
			return model;
		}
		
		
		
		
     else{
			
			model.addObject("warning","資料不存在");
			return model;
		}

	}

}
