package main;

import java.math.BigInteger;

import jamp.model.Address;
import jamp.model.Employee;
import jamp.model.EmployeeStatus;
import jamp.model.PersonalInfo;
import jamp.model.Unit;
import jamp.processor.OfficeManager;

public class Main {
	
	public static void main(String[] args) {
		OfficeManager manager = new OfficeManager();
		
		Employee employee = new Employee(new BigInteger("10000"), EmployeeStatus.WORKER);
		
		PersonalInfo personalInfo = new PersonalInfo("Petr", "Ivanov");
		employee.setPersonalInfo(personalInfo);
		
		Address address = new Address("Mira", "63");
		employee.setAddress(address);
		
		Unit unit = new Unit("Java");

		long employeeId = manager.hireEmployee(employee);
		
		System.out.println("Employee ID - " + employeeId);
	}

}
