package com.promotions.delphi.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promotions.delphi.models.Employee;
import com.promotions.delphi.repository.EmployeeRepository;
import com.promotions.delphi.service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployees() {
		
		return employeeRepository.findAll();
		
	}
	
}
