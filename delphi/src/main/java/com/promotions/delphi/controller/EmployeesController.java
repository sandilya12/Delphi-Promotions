package com.promotions.delphi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

}
