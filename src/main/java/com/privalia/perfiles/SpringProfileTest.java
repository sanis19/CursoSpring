package com.privalia.perfiles;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringProfileTest {
	
	public static void main(String[] args){
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.getEnvironment().setActiveProfiles("prod");
		ctx.scan("com.privalia.perfiles");
		ctx.refresh();
		
		User user = ctx.getBean(User.class);
		System.out.println("id "+user.id+" ,Name "+user.name);
		ctx.close();
		
	}
}
