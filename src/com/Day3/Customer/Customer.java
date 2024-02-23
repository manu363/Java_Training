package com.Day3.Customer;

public class Customer {
	private String CustomerName;
	private String CustomerCity;
	private String CustomerId;
	
	//Default Constructor
	public Customer() {
		
	}
	//Parameterized Constructor
	public Customer(String customerName, String customerCity, String customerId) {
		super();
		CustomerName = customerName;
		CustomerCity = customerCity;
		CustomerId = customerId;
	}
	
	//getters and setters
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getCustomerCity() {
		return CustomerCity;
	}
	public void setCustomerCity(String customerCity) {
		CustomerCity = customerCity;
	}
	public String getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(String customerId) {
		CustomerId = customerId;
	}
	@Override
	public String toString() {
		return "Customer [CustomerName=" + CustomerName + ", CustomerCity=" + CustomerCity + ", CustomerId="
				+ CustomerId + "]";
	}
	
	
}
