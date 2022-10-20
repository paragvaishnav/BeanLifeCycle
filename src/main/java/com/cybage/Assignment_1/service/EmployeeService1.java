package com.cybage.Assignment_1.service;

import com.cybage.Assignment_1.model.Employee;

public class EmployeeService1 {

	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public EmployeeService1() {
		System.out.println("Employee Service Constructor called");
	}
	
	public void destroy() throws Exception {
		System.out.println("dESTroy method from employee service");
	}

	//post-init method
	public void init() throws Exception {
		System.out.println("MyEmployeeService initializing to dummy value");
		if(employee.geteName() == null){
			employee.seteName("Jhouns");
		}
	}
	
}
