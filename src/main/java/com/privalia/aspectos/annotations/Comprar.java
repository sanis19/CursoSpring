package com.privalia.aspectos.annotations;

import org.springframework.stereotype.Component;

//@EnableAspectJAutoProxy
//@ComponentScan(basePackages = "com.privalia.aspectos.annotations")
@Component
public class Comprar implements Compra{
	
	public void compra(boolean error) throws Exception{
		if(error){
			throw new Exception("Algo ha ido mal....");
		}
		
		System.out.println("Realizando la compra...");
		
	}
}
