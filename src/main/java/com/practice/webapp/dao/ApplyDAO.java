package com.practice.webapp.dao;
import com.practice.webapp.entity.Examinee;
import com.practice.webapp.entity.TestRoom;

public interface ApplyDAO {

	public void applyGSAT(Examinee examinee);
	public void applyAST(Examinee examinee);
	public void applyEL(Examinee examinee);
}
