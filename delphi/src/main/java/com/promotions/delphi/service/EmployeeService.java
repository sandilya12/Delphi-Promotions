package com.promotions.delphi.service;

import java.util.List;

import com.promotions.delphi.models.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployees();
	public Employee getEmployee(long employeeId);
	public Employee addUser(Employee employee);
	public Employee updateUser(Employee employee);
}
