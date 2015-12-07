package com.practice.webapp.dao.impl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

//import com.mysql.jdbc.Statement;
import com.practice.webapp.dao.RegisterDAO;
import com.practice.webapp.entity.Examinee;
public class RegisterDAOImpl implements RegisterDAO{

	private DataSource dataSource;
	private Connection conn = null ;
	private ResultSet rs = null ;
	private PreparedStatement smt = null ;
	
	
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void register(Examinee examinee){
		
	}
    public void setTestNumber(Examinee examinee){
    	
    }
    public void setTestRoom(Examinee examinee){
    	
    }
    public void setPayment(Examinee examinee){
    	
    }
    public void setSubject(Examinee examinee){
    	
    }
	
	
	
}
