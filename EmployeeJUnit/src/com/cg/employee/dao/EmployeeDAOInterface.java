package com.cg.employee.dao;

import java.util.List;

import com.cg.employee.exception.EmployeeNotFoundException;
import com.cg.employee.exception.ParameterNullException;

import com.cg.employee.pojo.Employee;

public interface EmployeeDAOInterface {

	List<Employee> getAllNames();

	Employee getEmployee(int id) throws EmployeeNotFoundException;

	void addEmployee(int id,Employee emp) throws ParameterNullException;

	void deleteEmployee(int id);

	void updateEmployee(int id, Employee emp);

}