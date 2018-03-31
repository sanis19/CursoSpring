package com.privalia.aspectos;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {
	public static void main(String[]args){
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml" );
		
		Compra compra = (Compra) context.getBean("compra");
		
		try{
			System.out.println("Invocamos sin problemas");
			compra.compra(false);
			
			System.out.println("Invocamos con error");
			compra.compra(true);
			
		}catch(Exception e){
			System.out.println("Obtenemos la excepcion"+e);
		}
		
		
		context.close();
		
		}
}
