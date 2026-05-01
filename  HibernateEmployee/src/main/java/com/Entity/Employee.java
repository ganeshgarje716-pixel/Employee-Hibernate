package com.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employees")
public class Employee {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
	
	private String name;
	
	@Column(unique=true)
	private String email;
	
	@Column(unique=true)
	private String mobileNo;
	
	private double salary;
	
	@Column(name="Department")
	private String dep;
	
	private String gender;
	
	private String city;

	
	
	
	public Employee(int id, String name, String email, String mobileNo, double salary, String dep, String gender,
			String city) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobileNo = mobileNo;
		this.salary = salary;
		this.dep = dep;
		this.gender = gender;
		this.city = city;
	}


	
	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getMobileNo() {
		return mobileNo;
	}




	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}




	public double getSalary() {
		return salary;
	}




	public void setSalary(double salary) {
		this.salary = salary;
	}




	public String getDep() {
		return dep;
	}




	public void setDep(String dep) {
		this.dep = dep;
	}




	public String getGender() {
		return gender;
	}




	public void setGender(String gender) {
		this.gender = gender;
	}




	public String getCity() {
		return city;
	}




	public void setCity(String city) {
		this.city = city;
	}




	@Override
	public String toString() {
		return "EmployeeMain [id=" + id + ", name=" + name + ", email=" + email + ", mobileNo=" + mobileNo + ", salary="
				+ salary + ", dep=" + dep + ", gender=" + gender + ", city=" + city + "]";
	}
	
	
	
	
	
	
}
