package com.practice.webapp.dao;

import com.practice.webapp.entity.Examinee;
import com.practice.webapp.entity.TestRoom;

public interface QueryDAO {

	public Examinee GSATtestRoomQuery(Examinee examinee);
	public int GSATtestnumberQuery(Examinee examinee);
	public Examinee ELtestRoomQuery(Examinee examinee);
	public int ELtestnumberQuery(Examinee examinee);
	public TestRoom testRoomSetup(TestRoom testroom);
	public String ScoreQuery(Examinee examinee);
	public boolean ifExist(Examinee examinee);
	
}
