package com.collections.hashmapdemo.CitizenAddress;

public class Citizen {
	
	private String name;
	private int age;
	private String phone;
	private String email;
	private Address address;
	
	public Citizen(String name, int age, String phone, String email, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Citizen [name=" + name + ", age=" + age + ", phone=" + phone + ", email=" + email + ", address="
				+ address + "]";
	}	
}
