package com.Dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Config.HibernateConfig;
import com.Entity.Employee;

public class EmployeeDao {

	
	
		
		SessionFactory sf=HibernateConfig.getSessionFactory();
	
		
		
		public Employee insertEmployee(Employee employee) {
			
			Session session = sf.openSession();
			
			Transaction tr = session.beginTransaction();
			
			session.save(employee);
			
			tr.commit();
			
			session.close();
			
			return employee;
		}
		
		
		
		public Employee getEmployee(int id) {
			
			
			Session session = sf.openSession();
			
			Employee employee = session.get(Employee.class, id);
			
			return employee;
		}
		
		
		
		
		public String updateById(Employee employee) {
			
			Session session = sf.openSession();
			
			Transaction tr = session.beginTransaction();
			
			Employee existing = session.get(Employee.class, employee.getId());
			
			existing.setName(employee.getName());
			existing.setEmail(employee.getEmail());
			existing.setMobileNo(employee.getMobileNo());
			existing.setSalary(employee.getSalary());
			existing.setDep(employee.getDep());
			existing.setGender(employee.getGender());
			existing.setCity(employee.getCity());
			
			session.update(existing);
			
			tr.commit();
			
			session.close();
			
			return "Employee Update";
		}
		
		
		
		public List<Employee> getAllEmployees() {
			
			Session session = sf.openSession();
			
			List<Employee> employees = session.createQuery("from Employee").list();
			
			return employees;
		}
		
		
		
		public String deleteEmployee(int id) {
			
			Session session = sf.openSession();
			
			Transaction tr = session.beginTransaction();
			
			Employee employee = session.get(Employee.class, id);
			
			session.delete(employee);
			
			tr.commit();
			
			session.close();
			
			return "Employee Delete";
		}
		
		
		
		
	
	
}
