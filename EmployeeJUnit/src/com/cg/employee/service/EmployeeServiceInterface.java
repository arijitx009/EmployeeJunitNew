package com.cg.employee.service;

import java.util.List;

import com.cg.employee.pojo.Employee;

public interface EmployeeServiceInterface {

	List<Employee> getAllNames();

	Employee getEmployee(int id);

	void addEmployee(Employee emp);

	void deleteEmployee(int id);

	void updateEmployee(int id, Employee emp);

}