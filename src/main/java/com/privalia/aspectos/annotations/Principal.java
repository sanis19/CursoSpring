package com.privalia.aspectos.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class Principal {
	public static void main(String[]args){
		
       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
       context.scan("com.privalia.aspectos.annotations");
       context.refresh();
		
		Compra compra = (Compra) context.getBean(Compra.class);
		
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
