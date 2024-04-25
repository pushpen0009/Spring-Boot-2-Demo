package com.parent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.parent.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	public Employee findByName(String name);
	
}
