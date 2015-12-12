package com.practice.webapp.dao;
import java.util.List;

import com.practice.webapp.entity.Examinee;
import com.practice.webapp.entity.TestRoom;

public interface RegisterDAO {
	
	public void register(Examinee examinee);
	public Boolean login(Examinee examinee);
	public Examinee getExaminee(Examinee examinee);
    
	
    
    public void setSubject(Examinee examinee);
}
