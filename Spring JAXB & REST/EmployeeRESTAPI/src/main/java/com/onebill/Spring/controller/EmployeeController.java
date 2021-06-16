package com.onebill.Spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onebill.Spring.bean.EmployeeInfo;
import com.onebill.Spring.response.EmployeeResponse;
import com.onebill.Spring.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@GetMapping(path ="/getEmployee" , produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public EmployeeResponse getEmployeeData(Integer id) {
		
		EmployeeInfo employeeInfo = service.getEmp(id);
		EmployeeResponse response = new EmployeeResponse();
		
		if(employeeInfo!=null) {
			response.setStatusCode(200);
			response.setMsg("Success");
			response.setDescription("Data Found for ID "+id);
			response.setEmployeeInfo(employeeInfo);
		}else {
			response.setStatusCode(404);
			response.setMsg("Failure");
			response.setDescription("Data Not Found for ID "+id);
		}
		return response;
	} //end of getEmployee
	
	@GetMapping(path="/getAll", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public EmployeeResponse getAllEmployees() {
		List<EmployeeInfo> employeeInfos  = service.getAllEmpData();
		EmployeeResponse response = new EmployeeResponse();
		
		if(employeeInfos!=null) {
			response.setStatusCode(200);
			response.setMsg("Success");
			response.setDescription("Details Found");
			response.setEmployeeInfos(employeeInfos);
		}else {
			response.setStatusCode(404);
			response.setMsg("Failure");
			response.setDescription("Tables is empty");
		}
		return response;
	} //end of getAllEmployee
	
	@PostMapping(path="/add", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE}, 
			consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE} )
	public EmployeeResponse addEmployee(@RequestBody EmployeeInfo employeeinfo) {
		EmployeeResponse response = new EmployeeResponse();
		
		if(service.addEmployee(employeeinfo)) {
			response.setStatusCode(200);
			response.setMsg("Success");
			response.setDescription("Data Inserted");
			}else {
				response.setStatusCode(400);
				response.setMsg("Failure");
				response.setDescription("Could not Insert the data");
			}
		return response;	
	} // end of add employee
	
	@DeleteMapping(path="/delete/{id}", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public EmployeeResponse deleteEmployee(@PathVariable(name="id") int id) {
		EmployeeResponse response = new EmployeeResponse();

		if(service.deleteEmployee(id)) {
			response.setStatusCode(200);
			response.setMsg("Success");
			response.setDescription("Data Deleted for Id "+id);
			}else {
				response.setStatusCode(400);
				response.setMsg("Failure");
				response.setDescription("Could not Find  with the Id "+id);
			}
		return response;
	} //end of Delete Employee

	@PutMapping(path="/update", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE}, 
			consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE} )
	public EmployeeResponse updateEmployee(@RequestBody EmployeeInfo employeeInfo) {
		EmployeeResponse response = new EmployeeResponse();
		
		if(service.updateEmployee(employeeInfo)) {
			response.setStatusCode(200);
			response.setMsg("Success");
			response.setDescription("Data Updated for  "+employeeInfo.getEmpid());
			}else {
				response.setStatusCode(400);
				response.setMsg("Failure");
				response.setDescription("Could not Find  with the Id "+employeeInfo.getEmpid());
			}
		return response;
	} //end of Update Employee

}
