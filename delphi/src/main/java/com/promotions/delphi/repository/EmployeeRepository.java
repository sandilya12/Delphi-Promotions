package com.promotions.delphi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.promotions.delphi.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
