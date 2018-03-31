package com.privalia.entity.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Principal {
	
	public static void main(String[] args){
		
		AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext();
		
		annotationContext.scan("com.privalia.entity.annotations");
		annotationContext.refresh();
		
		Student student = (Student)annotationContext.getBean(Student.class);
		
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
		
		annotationContext.close();
		
	}
	
	

}
