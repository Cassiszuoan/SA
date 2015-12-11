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
import com.practice.webapp.entity.Bill;
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
				String sql = "INSERT Examinee(ID,EMAIL,PASSWORD,NAME,PHONE,GENDER,ADDRESS,EMER_NAME,EMER_RELA,EMER_MOBILE,TEST_NUM)"+
						"VALUES(?,?,?,?,?,?,?,?,?,?)";
		
				try {
					conn = dataSource.getConnection();
					smt = conn.prepareStatement(sql);
					smt.setString(1, examinee.getID());
				    smt.setString(2, examinee.getEmail());
				    smt.setString(3, examinee.getPassword());
				    smt.setString(4, examinee.getName());
				    smt.setString(5, examinee.getPhone());
				    smt.setString(6, examinee.getGender());
				    smt.setString(7, examinee.getAddress());
					smt.setString(8, examinee.getEmergencyContact());
					smt.setString(9, examinee.getEmergencyContactRelationship());
					smt.setString(10, examinee.getEmergencyContactMobile());
					smt.setString(11, examinee.getID());
					
				    
					
			
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
    public void setTestNumber(Examinee examinee){
    	
    }
    public void setTestRoom(Examinee examinee){
    	
    }
    public void setPayment(Examinee examinee){
    	
    }
    public void setSubject(Examinee examinee){
    	
    }
	
	
	
}
