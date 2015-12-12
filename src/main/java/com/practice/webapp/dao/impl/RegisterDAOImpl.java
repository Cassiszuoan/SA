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
import com.practice.webapp.entity.ArticleCategory;
import com.practice.webapp.entity.Examinee;
import com.practice.webapp.entity.TestRoom;
public class RegisterDAOImpl implements RegisterDAO{

	private DataSource dataSource;
	private Connection conn = null ;
	private ResultSet rs = null ;
	private PreparedStatement smt = null ;
	
	
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void register(Examinee examinee){
		// TODO Auto-generated method stub
				String sql = "INSERT Examinee(ID,EMAIL,PASSWORD,NAME,PHONE,GENDER,BIRTH,ADDRESS,EMER_NAME,EMER_RELA,EMER_MOBILE,testroom)"+
						"VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
		
				try {
					conn = dataSource.getConnection();
					smt = conn.prepareStatement(sql);
					smt.setString(1, examinee.getID());
				    smt.setString(2, examinee.getEmail());
				    smt.setString(3, examinee.getPassword());
				    smt.setString(4, examinee.getName());
				    smt.setString(5, examinee.getPhone());
				    smt.setString(6, examinee.getGender());
				    smt.setString(7, examinee.getBirth());
				    smt.setString(8, examinee.getAddress());
					smt.setString(9, examinee.getEmergencyContact());
					smt.setString(10, examinee.getEmergencyContactRelationship());
					smt.setString(11, examinee.getEmergencyContactMobile());
					smt.setInt(12, examinee.getTestRoom().getId());
					
				    
					
			
					smt.executeUpdate();			
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
	}
	
	
	public Boolean login(Examinee examinee){
		String sql = " select * from Examinee where EMAIL= ? and PASSWORD= ?";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, examinee.getEmail());
			smt.setString(2, examinee.getPassword());
			rs = smt.executeQuery();
			if(rs.next()){
				return true;
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
		return false;
		
	}
	
	
	public Examinee getExaminee(Examinee examinee){
		String sql = "SELECT * FROM Examinee WHERE ID = ?";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, examinee.getID());
			rs = smt.executeQuery();
			if(rs.next()){
				
				examinee.setID(rs.getString("ID"));
				examinee.setEmail(rs.getString("EMAIL"));
				examinee.setPassword(rs.getString("PASSWORD"));
				examinee.setTestNumber(rs.getInt("TEST_NUM"));
				examinee.setName(rs.getString("NAME"));
				examinee.setGender(rs.getString("GENDER"));
				examinee.setBirth(rs.getString("BIRTH"));
				examinee.setPhone(rs.getString("PHONE"));
				examinee.setPayed(rs.getBoolean("LOW_INCOME"));
				examinee.setGSATscore(rs.getString("GSATscore"));
				examinee.setASTscore(rs.getString("ASTscore"));
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
		return examinee;
	}
	
    
	
	
	
	
    
    
    public void setSubject(Examinee examinee){
    	
    }
	
	
	
}
