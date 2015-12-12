package com.practice.webapp.entity;

public class TestRoom {

	private int testroomID;
	private String testroomName;
	private String testroomAddress;
	
	
	public void setTestRoomID(int testroom){
		this.testroomID = testroom;
	}
	
	public int getTestRoomID(){
		return testroomID;
	}
	
	public void setTestRoomName(String testroomName){
		this.testroomName=testroomName;
	}
	public String getTestRoomName(){
		return testroomName;
	}
	
	
	public void setTestRoomAddress(String TestRoomAdress){
		this.testroomAddress = TestRoomAdress;
	}
	
	public String getTestRoomAddress(){
		return testroomAddress;
	}
	 
}
