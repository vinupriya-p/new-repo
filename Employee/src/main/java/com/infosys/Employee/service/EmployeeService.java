package com.infosys.Employee.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.Employee.repository.EmployeeRepository;
import com.infosys.Employee.model.Employee;

@Service
public class EmployeeService {


	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> getAll()   
	{  
		List<Employee> employees = new ArrayList<Employee>();  
		employeeRepository.findAll().forEach(employee -> employees.add(employee));  
		return employees;  
	}  
	
	public void save(Employee employee)   
	{  
		employeeRepository.save(employee);  
	}  
	
	public Employee getEmployeeById(int id)   
	{  
		return employeeRepository.findById(id).get();  
	}  
	
	public void delete(int id)   
	{  
		employeeRepository.deleteById(id);  
	}  
	
}
