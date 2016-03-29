package jamp.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import jamp.model.Project;
import jamp.model.Unit;
import jamp.processor.OfficeManager;
import jamp.request.EmployeeRequest;
import jamp.response.OfficeManagerResponse;
import model.mapping.EmployeeRequestMapper;

@WebService
public class OfficeManagerService {

	private OfficeManager manager = new OfficeManager();

	@WebMethod
	public long hireEmployee(EmployeeRequest request) {
		return manager.hireEmployee(EmployeeRequestMapper.mapEmployeeRequest(request));
	}

	@WebMethod
	public OfficeManagerResponse deleteEmployee(@WebParam(name = "employeeId") long employeeId) {
		OfficeManagerResponse response = new OfficeManagerResponse();
		try {
			manager.deleteEmployee(employeeId);
			response.setResult(0);
			response.setDescription("Employee successfully deleted.");
		} catch (Exception e) {
			response.setResult(1);
			response.setDescription(e.getMessage());
		}
		return response;
	}

	@WebMethod
	public long createUnit(String unitName) {
		return manager.createUnit(new Unit(unitName));
	}

	@WebMethod
	public long createProject(String projectName) {
		return manager.createProject(new Project(projectName));
	}

	@WebMethod
	public OfficeManagerResponse setUnitForEmployee(@WebParam(name = "unitId") long unitId,
			@WebParam(name = "employeeId") long employeeId) {
		OfficeManagerResponse response = new OfficeManagerResponse();
		try {
			manager.setUnitForEmployee(unitId, employeeId);
			response.setResult(0);
			response.setDescription("Employee successfully added to unit.");
		} catch (Exception e) {
			response.setResult(1);
			response.setDescription(e.getMessage());
		}
		return response;
	}

	@WebMethod
	public OfficeManagerResponse stuffEmployeeToProject(@WebParam(name = "projectId") long projectId,
			@WebParam(name = "employeeId") long employeeId) {
		OfficeManagerResponse response = new OfficeManagerResponse();
		try {
			manager.stuffEmployeeToProject(projectId, employeeId);
			response.setResult(0);
			response.setDescription("Employee successfully stuffed to project.");
		} catch (Exception e) {
			response.setResult(1);
			response.setDescription(e.getMessage());
		}
		return response;
	}

}
