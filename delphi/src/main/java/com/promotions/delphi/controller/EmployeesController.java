package com.promotions.delphi.controller;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.promotions.delphi.models.Employee;
import com.promotions.delphi.service.EmployeeService;

@RestController
@RequestMapping("/rest/api/employee")
public class EmployeesController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/all")
	private List<Employee> allEmployees() {

		List<Employee> employees = new ArrayList<Employee>();
		
		employees = employeeService.getAllEmployees();
		
		return employees;
	}
	
	@GetMapping("/get/{employeeId}")
	private Employee getEmployee(@PathVariable long employeeId) {
		
		return employeeService.getEmployee(employeeId);
		
	}
		
	@PostMapping("/post/addEmployee")
	private Employee addEmployee(@Validated @RequestBody Employee employee) {
		
		return employeeService.addUser(employee);
	}
	
	@PostMapping("/post/updateEmployee")
	private Employee updateEmployee(@Validated @RequestBody Employee employee) {
		
		return employeeService.updateUser(employee);
	}
}
