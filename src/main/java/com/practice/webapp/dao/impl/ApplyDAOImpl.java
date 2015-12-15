package com.practice.webapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.practice.webapp.dao.ApplyDAO;
import com.practice.webapp.entity.Examinee;
import com.practice.webapp.entity.Examinee;



public class ApplyDAOImpl implements ApplyDAO {
	
	
	private DataSource dataSource;
	private Connection conn = null ;
	private ResultSet rs = null ;
	private PreparedStatement smt = null ;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void applyGSAT(Examinee examinee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void applyAST(Examinee examinee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void applyEL(Examinee examinee) {
		// TODO Auto-generated method stub
		
	}

}
