package com.example.Hostel.dtos;

public class BuildingDto {
	
	private String buildingName;
	private int noOfFloors;
	private int hosteldid;
	
	
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public int getNoOfFloors() {
		return noOfFloors;
	}
	public void setNoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}
	public int gethosteldid() {
		return hosteldid;
	}
	public void sethosteldid(int hosteldid) {
		this.hosteldid = hosteldid;
	}
	
}
