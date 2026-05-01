package com.Controller;

import java.util.List;

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
	
	
	
	public List<Employee> getAll(){
		
		return service.getAll();
	}
	
	
	
	public String delete(int id) {
		
		return service.delete(id);
	}
	
	
	
	
	
	
	
}
