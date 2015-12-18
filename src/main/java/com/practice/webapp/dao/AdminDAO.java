package com.practice.webapp.dao;
import com.practice.webapp.entity.Admin;
import com.practice.webapp.entity.ELscore;
import com.practice.webapp.entity.Examinee;
import com.practice.webapp.entity.GSATscore;

import java.util.List;
public interface AdminDAO {
    
	public List<Examinee> getList(String sql);
	public List<Examinee> getAllExamineeList();
	public List<GSATscore> getGSATList();
	public List<ELscore> getELList();
	public Examinee get(Examinee examinee);
	public GSATscore get(GSATscore GSATscore);
	public void GSATallocate(GSATscore GSATscore);
	public ELscore get(ELscore eLscore);
	public void ELallocate(ELscore eLscore);
}
