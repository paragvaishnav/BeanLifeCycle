package com.cybage.Assignment_1.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MyService {

	@PostConstruct
	public void init() {
		System.out.println("myService init method called");
	}
	
	public MyService() {
		System.out.println("cONSTtructor of MyService called");
	}
	@PreDestroy
	public void destory(){
		System.out.println("MyService destroy method called");
	}
	
}
