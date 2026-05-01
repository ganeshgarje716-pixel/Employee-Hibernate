package com.Service;

import com.Dao.EmployeeDao;
import com.Entity.Employee;

public class EmployeeService {

	
	EmployeeDao dao=new EmployeeDao();
	
	
	
	public Employee insert(Employee employee) {
		
		return dao.insertEmployee(employee);
	}
	
	
	
	public Employee get(int id) {
		
		return dao.getEmployee(id);
	}
		
		
	
	
	
	
	
	
}
