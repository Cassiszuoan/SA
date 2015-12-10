package com.practice.webapp.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import java.util.Date;

@Component
@Scope(value="session", proxyMode=ScopedProxyMode.TARGET_CLASS)
public class Examinee implements java.io.Serializable {

	private static final long serialVersionUID = 3476619468809859762L;
	private String name;
	private String id;
	private String testnumber;
	private String password;
	private Date birth;
	private String phone;
	private String gender;
	private String address;
	private String EMER_Name;
	private String EMER_RELA;
	private String EMER_Mobile;
	private Boolean low_income;
	private Boolean payed;
	private String ASTscore;
	private String GSATscore;
	private TestRoom testroom = new TestRoom();
	
	
	
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
	
	
	
	public String getTestNumber(){
		return testnumber;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public String getPassword(){
		return password;
	}
	
	public void setBirth(Date birth){
		this.birth = birth;
	}
	
	public  Date getBirth(){
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
     
     
     public void setEMERname(String emername){
    	 this.EMER_Name = emername;
     }
    
     public String getEMERname(){
    	 return EMER_Name;
     }
     
     public void setEMERrelation(String emerrela){
    	 this.EMER_RELA = emerrela;
     }
    
     public String getEMERrelation(){
    	 return EMER_RELA;
     }
     
     
     
     public void setEMERmobile(String emermobile){
    	 this.EMER_Mobile = emermobile;
     }
    
     public String getEMERmobile(){
    	 return EMER_Mobile;
     }
     
     public void setLowIncome(Boolean lowincome){
    	 this.low_income = lowincome;
     }
     
     public Boolean getLowIncome(){
    	 return low_income;
     }
     
     
  
     public String getGSATscore(){
    	 return GSATscore;
     }
     
     public String getASTscore(){
    	 return ASTscore;
     }
     
     public void setPayed(Boolean payed){
    	 this.payed = payed;
     }
     
     public Boolean getPayed(){
    	 return payed;
     }
     
     
     public TestRoom getTestRoom(){
    	 return testroom;
     }


}
