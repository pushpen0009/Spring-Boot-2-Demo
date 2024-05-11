package com.parent.dtos;

import lombok.Data;

@Data
public class EmployeeResponse {

	int id;
	String name;
	int age;
	String designation;
	Long salary;
	String email;
	
}
