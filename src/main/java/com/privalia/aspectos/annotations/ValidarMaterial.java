package com.privalia.aspectos.annotations;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ValidarMaterial {
	
	@Pointcut("execution( * com.privalia.aspectos.annotations.Comprar.compra(..))")
    public void pointCutMethod() { }
	
	@Before("pointCutMethod()")
	public void comprobarCantidad(){
		System.out.println("Se comprueba que es la cantidad correcta");
	}
	@AfterReturning("pointCutMethod()")
	public void empaquetar(){
		System.out.println("Se empaqueta la mercancia");
	}
	@AfterThrowing("pointCutMethod()")
	public void ponerReclamacion(){
		System.out.println("Se reclaman los defectos detectados");
	}
}
