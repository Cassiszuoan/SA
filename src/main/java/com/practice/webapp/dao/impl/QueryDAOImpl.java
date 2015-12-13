package com.practice.webapp.dao.impl;
import com.practice.webapp.dao.QueryDAO;
import com.practice.webapp.entity.Examinee;
import com.practice.webapp.entity.TestRoom;
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
import com.practice.webapp.entity.TestRoom;
public class QueryDAOImpl implements QueryDAO {
     
	
	private DataSource dataSource;
	private Connection conn = null ;
	private ResultSet rs = null ;
	private PreparedStatement smt = null ;
	
	
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	
	@Override
	public TestRoom testRoomQuery(Examinee examinee) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM Examinee WHERE ID = ? and PASSWORD = ?";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, examinee.getID());
			smt.setString(2, examinee.getPassword());
			rs = smt.executeQuery();
			if(rs.next()){
				
				examinee.getTestRoom().setId(rs.getInt("testroom"));
				
				
			}
			rs.close();
			smt.close();
 
		} catch (SQLException e) {
			throw new RuntimeException(e);
 
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
		return examinee.getTestRoom();
	}
	

	@Override
	public int testNumberQuery(Examinee examinee) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM Examinee WHERE ID = ? and PASSWORD = ?";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, examinee.getID());
			smt.setString(2, examinee.getPassword());
			rs = smt.executeQuery();
			if(rs.next()){
				
				
				examinee.setTestNumber(rs.getInt("TEST_NUM"));
				
			}
			rs.close();
			smt.close();
 
		} catch (SQLException e) {
			throw new RuntimeException(e);
 
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
		return examinee.getTestNumber();
	}
	
	

	@Override
	public String ScoreQuery(Examinee examinee) {
		// TODO Auto-generated method stub
		return null;
	}

}
