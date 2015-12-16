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

	
	public void newGSATscore(Examinee examinee){
		String sql = "INSERT GSATscore(Chinese,English,Math,Society,Science,examineeID) "
				+ "VALUES(0,0,0,0,0,?)";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, examinee.getID());
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
	
	public int getGSATscore(Examinee examinee){
		String sql = "Select * from GSATscore where examineeID = ?";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, examinee.getID());
			
			rs = smt.executeQuery();
			if(rs.next()){
				examinee.getGSATscore().setId(rs.getInt("Score_ID"));
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
		
		return 1;
		
		
	}
	@Override
	public void applyGSAT(Examinee examinee) {
		// TODO Auto-generated method stub
		String sql = "UPDATE Examinee SET GSATscore = ? "
				+ "WHERE ID = ?";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setInt(1, examinee.getGSATscore().getId());
			smt.setString(2, examinee.getID());
			
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

	@Override
	public void applyAST(Examinee examinee) {
		// TODO Auto-generated method stub
		
	}

	public void newELscore(Examinee examinee){
		String sql = "INSERT ELscore(score,examineeID) "
				+ "VALUES(0,?)";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, examinee.getID());
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
	
	public int getELscore(Examinee examinee){
		String sql = "Select * from ELscore where examineeID = ?";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, examinee.getID());
			
			rs = smt.executeQuery();
			if(rs.next()){
				examinee.getELscore().setId(rs.getInt("Score_ID"));
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
		
		return 1;
		
		
	}
	@Override
	public void applyEL(Examinee examinee) {
		// TODO Auto-generated method stub
		String sql = "UPDATE Examinee SET ELscore = ? "
				+ "WHERE ID = ?";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setInt(1, examinee.getELscore().getId());
			smt.setString(2, examinee.getID());
			
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
