package com.parent.service;

import java.util.List;

import com.parent.dtos.EmployeeRequest;
import com.parent.dtos.EmployeeResponse;

public interface EmployeeService {

	public EmployeeResponse createEmployee(EmployeeRequest employeeRequest);
	
	public EmployeeResponse getEmployeeById(int employeeId);
	
	public List<EmployeeResponse> getAllEmployee();
	
	public EmployeeResponse updateEmployee(int employeeId, EmployeeRequest employeeRequest);
	
	public String deleteEmployee(int employeeId);

	public EmployeeResponse getEmployeeByName(String employeeName);
}

