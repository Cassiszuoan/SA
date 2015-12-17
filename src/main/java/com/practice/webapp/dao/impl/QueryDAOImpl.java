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
	public boolean ifExist(Examinee examinee) {
		// TODO Auto-generated method stub
		String sql = " select * from Examinee where ID = ? and BIRTH = ?";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			
			smt.setString(1, examinee.getID());
			smt.setString(2, examinee.getBirth());
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
	@Override
	public Examinee GSATtestRoomQuery(Examinee examinee) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM GSATscore WHERE examineeID = ? ";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, examinee.getID());
			rs = smt.executeQuery();
			if(rs.next()){
				
				examinee.getTestRoom().setId(rs.getInt("testroomID"));
				
				
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
	public String ScoreQuery(Examinee examinee) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public TestRoom testRoomSetup(TestRoom testroom) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM Testroom WHERE testroomID = ?";
		try {
			
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setInt(1, testroom.getId());
			
			rs = smt.executeQuery();
			if(rs.next()){
				
				
				testroom.setName(rs.getString("testroomName"));
				testroom.setAddress(rs.getString("testroomAddress"));
				
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
		return testroom;
	}

	@Override
	public int GSATtestnumberQuery(Examinee examinee) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM GSATscore WHERE examineeID = ? ";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, examinee.getID());
			rs = smt.executeQuery();
			if(rs.next()){
				
				return rs.getInt("Test_Num");
				
				
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
		return 0;
		
	}

	@Override
	public Examinee ELtestRoomQuery(Examinee examinee) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM ELscore WHERE examineeID = ? ";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, examinee.getID());
			rs = smt.executeQuery();
			if(rs.next()){
				
				examinee.getTestRoom().setId(rs.getInt("testroom_ID"));
				
				
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
	public int ELtestnumberQuery(Examinee examinee) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM ELscore WHERE examineeID = ? ";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, examinee.getID());
			rs = smt.executeQuery();
			if(rs.next()){
				
				return rs.getInt("Test_Num");
				
				
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
		return 0;
		
	}

	@Override
	public Examinee ASTtestRoomQuery(Examinee examinee) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM ASTscore WHERE examineeID = ? ";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, examinee.getID());
			rs = smt.executeQuery();
			if(rs.next()){
				
				examinee.getTestRoom().setId(rs.getInt("testroomID"));
				
				
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
	public int ASTtestnumberQuery(Examinee examinee) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM ASTscore WHERE examineeID = ? ";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, examinee.getID());
			rs = smt.executeQuery();
			if(rs.next()){
				
				return rs.getInt("Test_Num");
				
				
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
		return 0;
	}

}