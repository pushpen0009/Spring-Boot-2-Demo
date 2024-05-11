package com.parent.dtos;

import lombok.Data;

@Data
public class EmployeeRequest {

	int id;
	String name;
	int age;
	String designation;
	Long salary;
	String email;
	
}
