package com.infosys.Employee.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infosys.Employee.model.Employee;

@Repository
public interface EmployeeRepository  extends CrudRepository<Employee, Integer>{

}
