package com.parent.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String name;
	int age;
	String designation;
	Long salary;
	String email;
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Employee() {}
	public Employee(int id, String name, int age, String designation, Long salary, String email) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.designation = designation;
		this.salary = salary;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", " + (name != null ? "name=" + name + ", " : "") + "age=" + age + ", "
				+ (designation != null ? "designation=" + designation + ", " : "")
				+ (salary != null ? "salary=" + salary + ", " : "") + (email != null ? "email=" + email : "") + "]";
	}
}
