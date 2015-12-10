package com.practice.webapp.entity;

import java.util.Date;

public class Examinee {
private String name;
	private String id;
	private String EMAIL;
	private String testnumber;
	private String password;
	private Date birth;
	private String title;
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
	
	
	
	public String getTitle() {
		return title;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void setEmail(String email){
		this.EMAIL=email;
	}
	public String getEmail(){
		return EMAIL;
	}
	public void setID(String id){
		this.id = id;
	}
	public String getID(){
		return id;
	}
	
	
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public String getPassword(){
		return password;
	}
	
	
	public String getTestNumber(){
		return testnumber;
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
