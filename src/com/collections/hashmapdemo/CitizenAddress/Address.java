package com.collections.hashmapdemo.CitizenAddress;

public class Address {
	
	private int houseNo;
	private String area;
	private String city;
	private String state;
	private int pincode;
	
	public Address(int houseNo, String area, String city, String state, int pincode) {
		super();
		this.houseNo = houseNo;
		this.area = area;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public int getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", area=" + area + ", city=" + city + ", state=" + state + ", pincode="
				+ pincode + "]";
	}
}
