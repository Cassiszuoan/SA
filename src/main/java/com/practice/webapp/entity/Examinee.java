package com.practice.webapp.entity;

import java.util.Date;

public class Examinee {
private String name;
	private String ID;
	private String EMAIL;
	private String testnumber;
	private String password;
	private Date birth;
	private String title;
	private String phone;
	private String gender;
	private String address;
	private String EmergencyContact;
	private String EmergencyContactRelationship;
	private String EmergencyContactMobile;
	private Boolean lowincome;
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
		this.ID = id;
	}
	public String getID(){
		return ID;
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
     
     
     public void setEmergencyContact(String emername){
    	 this.EmergencyContact = emername;
     }
    
     public String getEmergencyContact(){
    	 return EmergencyContact;
     }
     
     public void setEmergencyContactRelationship(String emerrela){
    	 this.EmergencyContactRelationship = emerrela;
     }
    
     public String getEmergencyContactRelationship(){
    	 return EmergencyContactRelationship;
     }
     
     
     
     public void setEmergencyContactMobile(String emermobile){
    	 this.EmergencyContactMobile = emermobile;
     }
    
     public String getEmergencyContactMobile(){
    	 return EmergencyContactMobile;
     }
     
     public void setLowIncome(Boolean lowincome){
    	 this.lowincome = lowincome;
     }
     
     public Boolean getLowIncome(){
    	 return lowincome;
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
