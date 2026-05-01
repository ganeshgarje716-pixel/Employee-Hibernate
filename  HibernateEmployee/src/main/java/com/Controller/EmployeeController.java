package com.Controller;

import com.Entity.Employee;
import com.Service.EmployeeService;

public class EmployeeController {

	
	
	EmployeeService service=new EmployeeService();
	
	
	
	
	public Employee insert(Employee employee) {
		
		return service.insert(employee);
	}
	
	
	
	public Employee get(int id) {
		
		return service.get(id);
	}
	
	
	
	public String update(Employee employee) {
		
		return service.update(employee);
	}
	
	
	
	
	
	
	
}
