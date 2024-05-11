package com.parent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.parent.dtos.EmployeeRequest;
import com.parent.dtos.EmployeeResponse;
import com.parent.service.EmployeeService;

@RestController 
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/create")
	EmployeeResponse createEmployee(@RequestBody  EmployeeRequest employeeDto) {
		return employeeService.createEmployee(employeeDto);
	}
	
	@GetMapping("/getById")
	EmployeeResponse getEmployeeById(@RequestParam int employeeId) {
		return employeeService.getEmployeeById(employeeId);
	}
	
	@GetMapping("/getAll")
	List<EmployeeResponse> getAllEmployee(){
		return employeeService.getAllEmployee();
	}
	
	@PutMapping("/update/{employeeId}")
	EmployeeResponse updateEmployee(@PathVariable("employeeId") int employeeId, @RequestBody EmployeeRequest employee) {
		return employeeService.updateEmployee(employeeId, employee);
	}
	
	@DeleteMapping("/delete/{employeeId}")
	String deleteEmployee(@PathVariable("employeeId") int employeeId) {
		return employeeService.deleteEmployee(employeeId);
	}
	
	@GetMapping("/getByName")
	EmployeeResponse getEmployeeByName(@RequestParam String employeeName) {
		return employeeService.getEmployeeByName(employeeName);
	}
}

