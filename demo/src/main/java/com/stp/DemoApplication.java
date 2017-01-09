package com.stp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.sst.core.HelloWorld;

@SpringBootApplication
@ComponentScan({"com.sst.core"})
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
		helloWorld.showMessage("Nived");
	}
}
