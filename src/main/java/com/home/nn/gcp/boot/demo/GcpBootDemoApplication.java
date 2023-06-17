package com.home.nn.gcp.boot.demo;

import com.home.nn.gcp.boot.demo.prototype.PrototypeDemo;
import com.home.nn.gcp.boot.demo.singleton.SingletonDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class GcpBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(GcpBootDemoApplication.class, args);
		for(int j=0; j<10; j++) {
			SingletonDemo singletonDemo = ctx.getBean("sd", SingletonDemo.class);
			singletonDemo.getValue();
		}

		for(int k=0; k<10; k++) {
			PrototypeDemo prototypeDemo = ctx.getBean("pd", PrototypeDemo.class);
			prototypeDemo.getValue();
		}
	}

}
