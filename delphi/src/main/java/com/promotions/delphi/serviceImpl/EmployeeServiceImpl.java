package com.promotions.delphi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.promotions.delphi.data.DelphiConstants;
import com.promotions.delphi.models.Employee;
import com.promotions.delphi.repository.EmployeeRepository;
import com.promotions.delphi.service.EmployeeService;


@Component
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployees() {
		
		return employeeRepository.findAll();
		
	}
	
	@Override
	public Employee getEmployee(long employeeId) {
		
		 Employee employee = null;
		 
		 employee = employeeRepository.findById(employeeId).orElse(null);
		 
		 return employee;
	}

	@Override
	public Employee addUser(Employee employee) {
		
		return employeeRepository.save(employee);
		
	}

	@Override
	public Employee updateUser(Employee employee) {

		Employee empFromDb = null;

		if(employee != null && employee.getEmployeeId() != 0) {
			DelphiConstants.logger.info("EmployeeServiceImpl : updateUser : ");
			empFromDb = getEmployee(employee.getEmployeeId());
			DelphiConstants.logger.info("EmployeeServiceImpl : updateUser : empFromDb :" + empFromDb.hashCode() + "employee : " + employee.hashCode());

			if(empFromDb != null && empFromDb.hashCode() == employee.hashCode()) {
				
				DelphiConstants.logger.info("EmployeeServiceImpl : updateUser : empFromDb :" + empFromDb.hashCode() + "employee : " + employee.hashCode());

				empFromDb = employee;

			}
			else {
				empFromDb = employee;
				empFromDb = employeeRepository.save(empFromDb);
			}
		}

		return empFromDb;

	}
	
}
