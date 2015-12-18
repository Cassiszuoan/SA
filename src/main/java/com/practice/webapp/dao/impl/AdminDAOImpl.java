package com.practice.webapp.dao.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.practice.webapp.dao.AdminDAO;
import com.practice.webapp.dao.ProductDAO;
//import com.mysql.jdbc.Statement;
import com.practice.webapp.entity.Admin;
import com.practice.webapp.entity.Examinee;
import com.practice.webapp.entity.Product;
import com.practice.webapp.entity.TestRoom;
import com.practice.webapp.entity.GSATscore;
public class AdminDAOImpl implements AdminDAO{
	private DataSource dataSource;
	private Connection conn = null ;
	private ResultSet rs = null ;
	private PreparedStatement smt = null ;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	public List<Examinee> getAllExamineeList() {
		String sql = "SELECT * FROM Examinee";
		return getList(sql);
	}
	
	public List<GSATscore> getGSATList(){
		List<GSATscore> GSATscorelist = new ArrayList<GSATscore>();
		String sql="SELECT * FROM GSATscore";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while(rs.next()){
				GSATscore GSATscore = new GSATscore();
				GSATscore.setChinese(rs.getInt("Chinese"));
				GSATscore.setEnglish(rs.getInt("English"));
				GSATscore.setMath(rs.getInt("Math"));
				GSATscore.setScience(rs.getInt("Science"));
				GSATscore.setSociety(rs.getInt("Society"));
				GSATscore.setId(rs.getInt("Score_ID"));
				GSATscore.setExamineeID(rs.getString("examineeID"));
				TestRoom  testroom= new TestRoom();
				testroom.setId(rs.getInt("testroomiD"));
				GSATscore.setTestroom(testroom);
				GSATscore.setTestnumber(rs.getInt("Test_Num"));
				GSATscorelist.add(GSATscore);
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
		return GSATscorelist;
	}
	@Override
	public List<Examinee> getList(String sql) {
		List<Examinee> ExamineeList = new ArrayList<Examinee>();
		//will need this part later
		/*
		String sql = "SELECT * FROM article a "
				+ "JOIN article_category b ON a.articleCategoryID = b.articleCategoryID "
				+ "ORDER BY articleID DESC";
		*/
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while(rs.next()){
				Examinee examinee = new Examinee();
				examinee.setID(rs.getString("ID"));
				examinee.setEmail(rs.getString("EMAIL"));
				examinee.setPassword(rs.getString("PASSWORD"));
				examinee.setName(rs.getString("NAME"));
				examinee.setGender(rs.getString("GENDER"));
				examinee.setBirth(rs.getString("BIRTH"));
				examinee.setPhone(rs.getString("PHONE"));
				examinee.setAddress(rs.getString("ADDRESS"));
				examinee.getASTscore().setID(rs.getInt("ASTscore"));
				examinee.getGSATscore().setId(rs.getInt("GSATscore"));
				examinee.getELscore().setId(rs.getInt("ELScore"));
				examinee.setEmergencyContact(rs.getString("EMER_NAME"));
				examinee.setEmergencyContactRelationship(rs.getString("EMER_RELA"));
				examinee.setEmergencyContactMobile(rs.getString("EMER_MOBILE"));
				
				ExamineeList.add(examinee);
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
		return ExamineeList;
	}
	
	
	
public Examinee get(Examinee examinee) {
		
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
				examinee.setName(rs.getString("NAME"));
				examinee.setGender(rs.getString("GENDER"));
				examinee.setBirth(rs.getString("BIRTH"));
				examinee.setPhone(rs.getString("PHONE"));
				examinee.setAddress(rs.getString("ADDRESS"));
				examinee.getASTscore().setID(rs.getInt("ASTscore"));
				examinee.getGSATscore().setId(rs.getInt("GSATscore"));
				examinee.getELscore().setId(rs.getInt("ELScore"));
				examinee.setEmergencyContact(rs.getString("EMER_NAME"));
				examinee.setEmergencyContactRelationship(rs.getString("EMER_RELA"));
				examinee.setEmergencyContactMobile(rs.getString("EMER_MOBILE"));
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
@Override
public GSATscore get(GSATscore GSATscore) {
	// TODO Auto-generated method stub
	String sql = "SELECT * FROM GSATscore WHERE Score_ID = ?";
	try {
		conn = dataSource.getConnection();
		smt = conn.prepareStatement(sql);
		smt.setInt(1, GSATscore.getId());
		rs = smt.executeQuery();
		if(rs.next()){
			GSATscore.setChinese(rs.getInt("Chinese"));
			GSATscore.setEnglish(rs.getInt("English"));
			GSATscore.setMath(rs.getInt("Math"));
			GSATscore.setScience(rs.getInt("Science"));
			GSATscore.setSociety(rs.getInt("Society"));
			GSATscore.setExamineeID(rs.getString("examineeID"));
			TestRoom  testroom= new TestRoom();
			testroom.setId(rs.getInt("testroomiD"));
			GSATscore.setTestroom(testroom);
			GSATscore.setTestnumber(rs.getInt("Test_Num"));
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
	return GSATscore;
}
@Override
public void GSATallocate(GSATscore GSATscore) {
	// TODO Auto-generated method stub
	String sql = "UPDATE GSATscore SET Chinese=?, English=?, Math=?, Society=? , Science=?,testroomID=?, Test_Num=?"
			+ "WHERE Score_ID = ?";
	try {
		conn = dataSource.getConnection();
		smt = conn.prepareStatement(sql);
		
		smt.setInt(1, GSATscore.getChinese());
		smt.setInt(2, GSATscore.getEnglish());
		smt.setInt(3, GSATscore.getMath());
		smt.setInt(4, GSATscore.getSociety());
		smt.setInt(5, GSATscore.getScience());
		smt.setInt(6, 0);
		smt.setInt(7, GSATscore.getTestnumber());
		smt.setInt(8, GSATscore.getId());
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

}
