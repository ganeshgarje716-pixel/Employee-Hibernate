package com.Employee;

import java.lang.ModuleLayer.Controller;

import com.Controller.EmployeeController;
import com.Entity.Employee;

public class EmployeeMain {


	public static void main(String[] args) {
		
		
		EmployeeController controller=new EmployeeController();
		
		
		
		
//		System.out.println(controller.insert(new Employee(5, "Ram", "ram@gmail.com", "9078563412", 55000, "IT", "Male", "Mumbai")));
		
		
		System.out.println(controller.get(1));
		
		
		
		
		
		
		
	}
	
	
}
