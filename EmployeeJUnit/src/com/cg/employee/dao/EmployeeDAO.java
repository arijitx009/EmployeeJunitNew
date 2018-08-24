package com.cg.employee.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.cg.employee.exception.EmployeeNotFoundException;
import com.cg.employee.exception.ParameterNullException;

import com.cg.employee.pojo.Employee;


public class EmployeeDAO implements EmployeeDAOInterface {

	private Employee emp;


	private List<Employee> employees=new ArrayList<>(Arrays.asList(


			new Employee(1,"Arijit"),
			new Employee(2,"Rohit"),
			new Employee(3,"Rahul")
			));

	/* (non-Javadoc)
	 * @see com.cg.employee.dao.EmployeeDAOInterface#getAllNames()
	 */
	@Override
	public List<Employee> getAllNames()
	{
		return employees;
	}

	/* (non-Javadoc)
	 * @see com.cg.employee.dao.EmployeeDAOInterface#getEmployee(int)
	 */
	@Override
	public Employee getEmployee(int id) throws EmployeeNotFoundException
	
	{
	if(	(employees.size()<id||employees.get(id)==null))
	{
		throw new EmployeeNotFoundException("No Element Found");
	}
	
		
		
		return employees.stream().filter(e -> e.getId()==id).findFirst().get();
	}
	/* (non-Javadoc)
	 * @see com.cg.employee.dao.EmployeeDAOInterface#addEmployee(com.cg.employee.pojo.Employee)
	 */
	@Override
	public void addEmployee(int id,Employee emp) throws ParameterNullException
	{
		if(employees.size()<id||emp.getId()<=0 || emp.getName().equals(""))
		{
			throw new ParameterNullException("Parameters cannot be null or zero");
		}
		employees.add(emp);
		
		
			
		
	}

	/* (non-Javadoc)
	 * @see com.cg.employee.dao.EmployeeDAOInterface#deleteEmployee(int)
	 */
	@Override
	public void deleteEmployee(int id)
	{
		employees.removeIf(e -> e.getId()==id);

	}
	/* (non-Javadoc)
	 * @see com.cg.employee.dao.EmployeeDAOInterface#updateEmployee(int, com.cg.employee.pojo.Employee)
	 */
	@Override
	public void updateEmployee(int id,Employee emp)
	{
		for(int i=0;i< employees.size();i++) 
		{
			Employee e=employees.get(i);

			if(e.getId()==id)
			{
				employees.set(i, emp);
				return;
			}
		}
	}


}
