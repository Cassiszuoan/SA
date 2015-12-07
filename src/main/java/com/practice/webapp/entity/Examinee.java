package com.practice.webapp.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;


@Component
@Scope(value="session", proxyMode=ScopedProxyMode.TARGET_CLASS)
public class Examinee implements java.io.Serializable {

	private static final long serialVersionUID = 3476619468809859762L;
	private String name;
	private String id;
	private String testnumber;
	private String password;
	private String birth;
	private String phone;
	private String gender;
	private String address;
	private String photo;
	private Boolean low_income;
	private String subject_number;
	
	
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void setID(String id){
		this.id = id;
	}
	public String getID(){
		return id;
	}
	
	public void setTestNumber(String testnumber){
		this.testnumber = testnumber;
	}
	
	public String getTestNumber(){
		return testnumber;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public String getPassword(){
		return password;
	}
	
	public void setBirth(String birth){
		this.birth = birth;
	}
	
	public  String getBirth(){
		return birth;
	}
    
	public void setPhone(String phone){
		this.phone = phone;
	}
	
	public String getPhone(){

		
		return phone;
	}

    public void setGender(String gender){
    	this.gender = gender;
    }
    
    public String getGender(){
    	return gender;
    }
    
     public void setAddress(String address){
    	 this.address = address;
     }
     
     public String getAddress(){
    	 return address;
     }
     
     
     public void setPhoto(String photo){
    	 this.photo = photo;
     }
     
     public String getPhoto(){
    	 return photo;
     }
     
     public void setLowIncome(Boolean lowincome){
    	 this.low_income = lowincome;
     }
     
     public Boolean getLowIncome(){
    	 return low_income;
     }
     
     
     public void setSubjectNumber(String subjectnumber){
    	 this.subject_number = subjectnumber;
     }
     
     public String getSubjectNumber(){
    	 return subject_number;
     }




}
