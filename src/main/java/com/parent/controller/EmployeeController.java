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

import com.parent.entity.Employee;
import com.parent.service.EmployeeService;

@RestController 
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/create")
	Employee createEmployee(@RequestBody  Employee employee) {
		return employeeService.createEmployee(employee);
	}
	
	@GetMapping("/getById")
	Employee getEmployeeById(@RequestParam int employeeId) {
		return employeeService.getEmployeeById(employeeId);
	}
	
	@GetMapping("/getAll")
	List<Employee> getAllEmployee(){
		return employeeService.getAllEmployee();
	}
	
	@PutMapping("/update")
	Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}
	
	@DeleteMapping("/delete/{employeeId}")
	String deleteEmployee(@PathVariable("employeeId") int employeeId) {
		return employeeService.deleteEmployee(employeeId);
	}
	
	@GetMapping("/getByName")
	Employee getEmployeeByName(@RequestParam String employeeName) {
		return employeeService.getEmployeeByName(employeeName);
	}
}

