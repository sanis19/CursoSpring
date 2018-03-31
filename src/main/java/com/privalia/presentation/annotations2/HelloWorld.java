package com.privalia.presentation.annotations2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


/*
 * @Repository - Used to mark a bean as DAO Component on persistence layer.
 * @Service - Used to mark a bean as Service Component on business layer.
 * @RestController - Used to mark a bean as RestController Component on Web Service layer.
 * @Controller - Used to mark a bean as Controller Component on Presentation layer.  Controlador de la capa presentacion SPRING MVC, con angula se quita.
 * @Configuration - Used to mark a bean as Configuration Component.
 * @Component - General purpose annotation can be used as a replacement for above annotations.
 * www.baeldung.com
 *
 */
@Component(value = "helloWorld")
public class HelloWorld {
		
		private String hello;

		/**
		 * @return the hello
		 */
		public String getHello() {
			return hello;
		}

		/**
		 * @param hello the hello to set
		 */
		@Autowired
		@Value("Hello World From Annotations!!!")
		public void setHello(String hello) {
			this.hello = hello;
		}
		
		public HelloWorld(){
			
		}
}
