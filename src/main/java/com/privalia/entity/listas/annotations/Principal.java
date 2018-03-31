package com.privalia.entity.listas.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Principal {
		
	public static void main(String[]args){
		
		AbstractApplicationContext context = 
				new AnnotationConfigApplicationContext(MyConfig.class);
		
		Student student = (Student)
				context.getBean("studentCons");
		
		System.out.println(student.toString());
		
		context.close();
	}
}
