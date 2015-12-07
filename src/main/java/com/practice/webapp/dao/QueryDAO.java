package com.practice.webapp.dao;

import com.practice.webapp.entity.Examinee;
import com.practice.webapp.entity.TestRoom;

public interface QueryDAO {

	public TestRoom testRoomQuery(Examinee examinee);
	public String testNumberQuery(Examinee examinee);
	public String ScoreQuery(Examinee examinee);
	
}
