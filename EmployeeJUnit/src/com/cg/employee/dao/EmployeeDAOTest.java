package com.cg.employee.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cg.employee.exception.EmployeeNotFoundException;
import com.cg.employee.exception.ParameterNullException;

import com.cg.employee.pojo.Employee;

//import junit.framework.Assert;
import org.junit.Assert;
class EmployeeDAOTest {

	
	@Test
	public void testGetAllNames() {
		EmployeeDAOInterface dao=new EmployeeDAO();
		Assert.assertEquals(dao.getAllNames().size(),3);
				
	}

	@Test
	public void testGetEmployee() {
		EmployeeDAOInterface dao=new EmployeeDAO();
		try {
			Assert.assertEquals(dao.getEmployee(2).getName(),"Rohit");
		} catch (EmployeeNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testGetEmployeewithUnmatchingID() {
		EmployeeDAOInterface dao=new EmployeeDAO();
		int flag=0;
		try {
			dao.getEmployee(8);
		} catch (EmployeeNotFoundException e) {
			// TODO Auto-generated catch block
			flag++;
			e.printStackTrace();
			
		}
		Assert.assertEquals(1, flag);
	
}
	

	
	
	
	
	
	

	@Test
	public void testAddEmployee() {
		EmployeeDAOInterface dao=new EmployeeDAO();
		try {
			dao.addEmployee(4,new Employee(4,"Rohan"));
		} catch (ParameterNullException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Assert.assertEquals("Rohan",dao.getEmployee(4).getName());
		} catch (EmployeeNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Test
	public void testAddEmployeewithNullValueId() 
	{
		EmployeeDAOInterface dao=new EmployeeDAO();
		int flag=0;
		try {
			dao.addEmployee(0,new Employee(0,"Ravi"));
		} catch (ParameterNullException e) {
			flag++;
			e.printStackTrace();
		}
		Assert.assertEquals(1, flag);
		
		
		
	}

	@Test
	public void testAddEmployeewithNullValueName() 
	{
		EmployeeDAOInterface dao=new EmployeeDAO();
		int flag=0;
		try {
			dao.addEmployee(4,new Employee(4,""));
		} catch (ParameterNullException e) {
			flag++;
			e.printStackTrace();
		}
		Assert.assertEquals(1, flag);
		
		
		
	}

	
	
	
	
	
	
	
	
	
	@Test
	void testDeleteEmployee() {
		EmployeeDAOInterface dao=new EmployeeDAO();
		dao.deleteEmployee(3);
		int flag=0;
		try {
		Employee emp=dao.getEmployee(3);
		}catch(Exception e) {
			flag++;
		}
		Assert.assertEquals(1, flag);
		
	}

	@Test
	void testUpdateEmployee() {
		EmployeeDAOInterface dao=new EmployeeDAO();
		dao.updateEmployee(2, new Employee(2,"Alisha"));
		try {
			Assert.assertEquals("Alisha", dao.getEmployee(2).getName());
		} catch (EmployeeNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	void testUpdateEmployeewithWrongId()
	{
		EmployeeDAOInterface dao=new EmployeeDAO();
		int flag=0;
		try {
		dao.updateEmployee(7, new Employee(6,"Rajib"));
		}catch(Exception e)
		{
			flag++;
		}
		Assert.assertEquals(0, flag);
	}
}

	
	

	
	
	
	


