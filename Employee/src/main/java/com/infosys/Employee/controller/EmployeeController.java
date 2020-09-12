package com.infosys.Employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.Employee.model.Employee;
import com.infosys.Employee.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping(value = "/employee/getall")  
	public List<Employee> getAll()   
	{  
		return employeeService.getAll();  
	}  
	
	@PostMapping(value = "/employee")  
	private int save(@RequestBody Employee employee)   
	{  
		employeeService.save(employee);  
		return employee.getEmp_id();  
	}  
	
	@GetMapping(value = "/employee/{id}") 
	private Employee getEmployee(@PathVariable("id") int id)   
	{  
		return employeeService.getEmployeeById(id);  
	}  
	
	@DeleteMapping(value = "/employee/{id}")  
	private void delete(@PathVariable("id") int id)   
	{  
		employeeService.delete(id);  
	}  
}
