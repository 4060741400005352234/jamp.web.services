package model.mapping;

import jamp.model.Employee;
import jamp.model.PersonalInfo;
import jamp.request.EmployeeRequest;

public class EmployeeRequestMapper {

	public static Employee mapEmployeeRequest(EmployeeRequest request) {
		if (request == null) {
			return null;
		}

		Employee employee = new Employee(request.getSalary(), request.getStatus());

		PersonalInfo personalInfo = new PersonalInfo(request.getEmployeeName(), request.getEmployeeSureName());
		employee.setPersonalInfo(personalInfo);
		
		employee.setAddress(request.getAddress());

		return employee;
	}

}
