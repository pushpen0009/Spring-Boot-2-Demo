package com.parent.service.Impl;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parent.dtos.EmployeeRequest;
import com.parent.dtos.EmployeeResponse;
import com.parent.entity.Employee;
import com.parent.repository.EmployeeRepository;
import com.parent.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	ModelMapper modelMapper;
	
	@Override
	public EmployeeResponse createEmployee(EmployeeRequest employeeRequest) {
		Employee employee = employeeRepository.save(modelMapper.map(employeeRequest, Employee.class));
		return modelMapper.map(employee, EmployeeResponse.class);
	}


	@Override
	public EmployeeResponse getEmployeeById(int employeeId) {
		Employee employee = employeeRepository.findById(employeeId).get();
		return modelMapper.map(employee, EmployeeResponse.class);
	}

	@Override
	public List<EmployeeResponse> getAllEmployee() {
		List<Employee> employeeList = employeeRepository.findAll();
		return modelMapper.map(employeeList, new TypeToken<List<EmployeeResponse>>() {}.getType());
	}

	@Override
	public EmployeeResponse updateEmployee(int employeeId, EmployeeRequest employeeRequest) {
		Optional<Employee> emp = employeeRepository.findById(employeeId);
		if(emp.isPresent())
			employeeRequest.setId(employeeId);

		Employee updatedEmployee = employeeRepository.save(modelMapper.map(employeeRequest, Employee.class));
		return modelMapper.map(updatedEmployee, EmployeeResponse.class);
	}

	@Override
	public String deleteEmployee(int employeeId) {
		Employee employee = employeeRepository.findById(employeeId).get();
		employeeRepository.delete(employee);
		return "Employee deleted successfully !";
	}

	@Override
	public EmployeeResponse getEmployeeByName(String employeeName) {
		Employee emp = employeeRepository.findByName(employeeName);
		return modelMapper.map(emp, EmployeeResponse.class);
	}

	

}
