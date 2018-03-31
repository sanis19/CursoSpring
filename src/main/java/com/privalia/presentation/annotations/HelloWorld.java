package com.privalia.presentation.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class HelloWorld {
		
		@Autowired
		@Value("Hello World From Annotations!!!")
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
		public void setHello(String hello) {
			this.hello = hello;
		}
}
