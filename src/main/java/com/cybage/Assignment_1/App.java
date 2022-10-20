package com.cybage.Assignment_1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cybage.Assignment_1.model.Employee;
import com.cybage.Assignment_1.service.EmployeeService;
import com.cybage.Assignment_1.service.EmployeeService1;

public class App {
	static Logger logger = LogManager.getLogger();
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		System.out.println("Spring ctx intialized");
		
		EmployeeService1 service = ctx.getBean("employeeService1",EmployeeService1.class);
		
		System.out.println("Bean retrieved from spring contxt");
		System.out.println("Employee Name="+service.getEmployee().geteName());
		ctx.close();
		
	}
}
