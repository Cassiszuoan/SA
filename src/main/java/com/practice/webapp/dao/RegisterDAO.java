package com.practice.webapp.dao;
import java.util.List;

import com.practice.webapp.entity.Examinee;

public interface RegisterDAO {
	
	public void register(Examinee examinee);
	public Boolean login(Examinee examinee);
    public void setTestNumber(Examinee examinee);
    public void setTestRoom(Examinee examinee);
    public void setPayment(Examinee examinee);
    public void setSubject(Examinee examinee);
}
