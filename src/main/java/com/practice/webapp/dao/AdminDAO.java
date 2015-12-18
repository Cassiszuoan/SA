package com.practice.webapp.dao;
import com.practice.webapp.entity.Admin;
import com.practice.webapp.entity.Examinee;
import java.util.List;
public interface AdminDAO {
    
	public List<Examinee> getList(String sql);
	public List<Examinee> getAllExamineeList();
	public Examinee get(Examinee examinee);
}
