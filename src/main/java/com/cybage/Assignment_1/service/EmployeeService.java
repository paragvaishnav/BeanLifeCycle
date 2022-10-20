package com.cybage.Assignment_1.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.cybage.Assignment_1.model.Employee;

public class EmployeeService implements InitializingBean, DisposableBean{

	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public EmployeeService() {}
	public EmployeeService(Employee employee) {
		super();
		this.employee = employee;
	}

	public void destroy() throws Exception {
		System.out.println("Destroy method starts..");
		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("EmployeeService initializing to dummy value");
		if(employee.geteName() == null){
			employee.seteName("Jhouns");
		}
	}
	
	
	
}
