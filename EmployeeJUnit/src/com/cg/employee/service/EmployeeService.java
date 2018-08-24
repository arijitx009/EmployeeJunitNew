package com.cg.employee.service;

import java.util.List;

import com.cg.employee.dao.EmployeeDAO;
import com.cg.employee.pojo.Employee;

public class EmployeeService implements EmployeeServiceInterface {
	
	private EmployeeDAO empDao;
	
	/* (non-Javadoc)
	 * @see com.cg.employee.service.EmployeeServiceInterface#getAllNames()
	 */
	@Override
	public List<Employee> getAllNames()
	{
		return empDao.getAllNames();
	}
	
	/* (non-Javadoc)
	 * @see com.cg.employee.service.EmployeeServiceInterface#getEmployee(int)
	 */
	@Override
	public Employee getEmployee(int id)
	{
		return empDao.getEmployee(id);
		
	}
	/* (non-Javadoc)
	 * @see com.cg.employee.service.EmployeeServiceInterface#addEmployee(com.cg.employee.pojo.Employee)
	 */
	@Override
	public void addEmployee(Employee emp)
	{
		empDao.addEmployee(emp);
	}
	/* (non-Javadoc)
	 * @see com.cg.employee.service.EmployeeServiceInterface#deleteEmployee(int)
	 */
	@Override
	public void deleteEmployee(int id)
	{
		empDao.deleteEmployee(id);

	}
	/* (non-Javadoc)
	 * @see com.cg.employee.service.EmployeeServiceInterface#updateEmployee(int, com.cg.employee.pojo.Employee)
	 */
	@Override
	public void updateEmployee(int id,Employee emp)
	{
		empDao.updateEmployee(id, emp);
	}

}
