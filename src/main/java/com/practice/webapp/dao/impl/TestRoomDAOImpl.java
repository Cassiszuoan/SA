package com.practice.webapp.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import javax.sql.DataSource;
import com.practice.webapp.entity.TestRoom;

public class TestRoomDAOImpl {

	private DataSource dataSource;
	private Connection conn = null ;
	private ResultSet rs = null ;
	private PreparedStatement smt = null ;
	
	
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public List<TestRoom> getTestRoomList() {
		// TODO Auto-generated method stub
		List<TestRoom> TestRoomList = new ArrayList<TestRoom>();
		String sql = "SELECT * FROM Testroom";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while(rs.next()){
				TestRoom testroom = new TestRoom();
				testroom.setTestRoomID(rs.getInt("testroomID"));
				testroom.setTestRoomName(rs.getString("testroomName"));
				testroom.setTestRoomAddress(rs.getString("testroomAddress"));
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
		return TestRoomList;
	}
}
