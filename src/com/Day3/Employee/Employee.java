package com.Day3.Employee;

public class Employee {
	private String Name;
	private String Dept;
	private int id;
	private int salary;
	private int age;
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", Dept=" + Dept + ", id=" + id + ", salary=" + salary + ", age=" + age + "]";
	}
	
	
	

}
