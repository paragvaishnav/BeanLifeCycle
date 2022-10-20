package com.cybage.Assignment_1.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Employee {

    Logger logger = LogManager.getLogger();
	
	private int eId;
	private String eName;

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

//	public Employee(int eId, String eName) {
//		super();
//		this.eId = eId;
//		this.eName = eName;
//	}
//	public Employee() {}
//	
//	public void init() throws Exception {
//		//System.out.print("here is ");
//		System.out.println("Init method called..");
//	}
//
//	public void destroy() throws Exception {
//		System.out.println("destroy method called..");
//	}
//
//	@Override
//	public String toString() {
//		return "Employee [eId=" + eId + ", eName=" + eName + "]";
//	}
}
