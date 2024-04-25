package com.parent.service;

import java.util.List;

import com.parent.entity.Employee;

public interface EmployeeService {

	public Employee createEmployee(Employee employee);
	
	public Employee getEmployeeById(int employeeId);
	
	public List<Employee> getAllEmployee();
	
	public Employee updateEmployee(Employee employee);
	
	public String deleteEmployee(int employeeId);

	public Employee getEmployeeByName(String employeeName);
}

