package com.sst.core;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
	
	public void showMessage(String name) {
		System.out.println("Hello, "+ name);
	}
}
