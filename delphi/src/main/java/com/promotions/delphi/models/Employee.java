package com.promotions.delphi.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Employee {

	@Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "employee_Sequencer")
    @SequenceGenerator(name = "employee_Sequencer", sequenceName = "Employee_SEQ")
    private long employeeId;
	
    @Column(name = "phoneNo")
	private Long phoneNo;	
	
    @Column(name = "Email")
	private String Email;
	
    @Column(name = "salaryGrade")
	private String salaryGrade	;
	
    @Column(name = "employee_role")
	private String employee_role	;
	
    @Column(name = "chargeOutRate")
	private String chargeOutRate	;
	
    @Column(name = "Manager")
	private long Manager	;
	
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public Long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getSalaryGrade() {
		return salaryGrade;
	}
	public void setSalaryGrade(String salaryGrade) {
		this.salaryGrade = salaryGrade;
	}
	public String getRole() {
		return employee_role;
	}
	public void setRole(String role) {
		this.employee_role = role;
	}
	public String getChargeOutRate() {
		return chargeOutRate;
	}
	public void setChargeOutRate(String chargeOutRate) {
		this.chargeOutRate = chargeOutRate;
	}
	public long getManager() {
		return Manager;
	}
	public void setManager(long manager) {
		Manager = manager;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [employeeId=");
		builder.append(employeeId);
		builder.append(", phoneNo=");
		builder.append(phoneNo);
		builder.append(", Email=");
		builder.append(Email);
		builder.append(", salaryGrade=");
		builder.append(salaryGrade);
		builder.append(", role=");
		builder.append(employee_role);
		builder.append(", chargeOutRate=");
		builder.append(chargeOutRate);
		builder.append(", Manager=");
		builder.append(Manager);
		builder.append("]");
		return builder.toString();
	}
	
}
