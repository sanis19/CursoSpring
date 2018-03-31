package com.privalia.presentation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	public static void main(String[] args){
		//Setter Injection
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		
		HelloWorld helloWorld = (HelloWorld)context.getBean("helloWorld");
		System.out.println(helloWorld.getHello());
				
		
		//Constructor Injection
		HelloWorld helloWorldConst = (HelloWorld)context.getBean("helloWorldConst");
		System.out.println(helloWorldConst.getHello());
		
		
		//Setter Injection

		HelloWorldLombok helloWorldLombok  = (HelloWorldLombok)context.getBean("helloWorldLombok");
		System.out.println(helloWorldLombok.getHello());
				
		
		//Constructor Injection
		HelloWorldLombok helloWorldLombokConst = (HelloWorldLombok)context.getBean("helloWorldLombokConst");
		System.out.println(helloWorldLombokConst.getHello());
		
		context.close();
		
	}
}
