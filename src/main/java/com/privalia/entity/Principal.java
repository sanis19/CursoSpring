package com.privalia.entity;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {
	
	public static void main(String[] args){
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		
		Student student = (Student)context.getBean("student");
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(student.getIdStudent());
		stringBuilder.append(" ");
		stringBuilder.append(student.getName());
		stringBuilder.append(" ");
		stringBuilder.append(student.getSurname());
		stringBuilder.append(" ");
		stringBuilder.append(student.getAge());
		stringBuilder.append(" ");
		stringBuilder.append(student.getAddress().toString());
		stringBuilder.append(" ");
		System.out.println(stringBuilder.toString());

		
		context.close();
		
	}

}
