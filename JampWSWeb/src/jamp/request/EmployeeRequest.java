package jamp.request;

import java.math.BigInteger;

import jamp.model.Address;
import jamp.model.EmployeeStatus;

public class EmployeeRequest {
	
	private String employeeName;
	private String employeeSureName;
	private BigInteger salary;
	private Address address;
	private EmployeeStatus status;
	public String getEmployeeName() {		
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeSureName() {
		return employeeSureName;
	}
	public void setEmployeeSureName(String employeeSureName) {
		this.employeeSureName = employeeSureName;
	}
	public BigInteger getSalary() {
		return salary;
	}
	public void setSalary(BigInteger salary) {
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public EmployeeStatus getStatus() {
		return status;
	}
	public void setStatus(EmployeeStatus status) {
		this.status = status;
	}
}
