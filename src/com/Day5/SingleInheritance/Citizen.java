package com.Day5.SingleInheritance;

public class Citizen {
	
	private String name;
	private String aadhaarNo;
	private String address;
	private long phno;
	
	
	public Citizen() {
		System.out.println("Citizen object is created");
	}


	public Citizen(String name, String aadhaarNo, String address, long phno) {
		
		this.name = name;
		this.aadhaarNo = aadhaarNo;
		this.address = address;
		this.phno = phno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAadhaarNo() {
		return aadhaarNo;
	}


	public void setAadhaarNo(String aadhaarNo) {
		this.aadhaarNo = aadhaarNo;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public long getPhno() {
		return phno;
	}


	public void setPhno(long phno) {
		this.phno = phno;
	}


	@Override
	public String toString() {
		return "Citizen [name=" + name + ", aadhaarNo=" + aadhaarNo + ", address=" + address + ", phno=" + phno + "]";
	}
	
	
	
	
	
	

}
