package com.parent.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.parent.entity.Employee;
import com.parent.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public Employee createEmployee(Employee employee) {
		return  employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		Employee employee = employeeRepository.findById(employeeId).get();
		return employee;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> employeeList = employeeRepository.findAll();
		return employeeList;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		Employee emp = employeeRepository.findById(employee.getId()).get();
		emp.setName(employee.getName());
		emp.setAge(employee.getAge());
		emp.setDesignation(employee.getDesignation());
		emp.setEmail(employee.getEmail());
		emp.setSalary(employee.getSalary());
		
		return  employeeRepository.save(emp);
	}

	@Override
	public String deleteEmployee(int employeeId) {
		Employee employee = employeeRepository.findById(employeeId).get();
		employeeRepository.delete(employee);
		return "Employee deleted successfully !";
	}

	@Override
	public Employee getEmployeeByName(String employeeName) {
		return employeeRepository.findByName(employeeName);
	}

}
