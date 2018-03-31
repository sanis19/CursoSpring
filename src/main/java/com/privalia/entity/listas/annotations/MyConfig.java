package com.privalia.entity.listas.annotations;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
	
	@Bean(name = "studentCons")
	public Student student() {
		return new Student();
	}
	
	@Bean(name = "listTeacher")
	public List<Teacher> address() {
		
		List<Teacher> teachers = new ArrayList<Teacher>();
		Teacher teacher1 = new Teacher();
		teacher1.setIdTeacher(1);
		teacher1.setName("Jordi");
		teachers.add(teacher1);
		
		teacher1 = new Teacher();
		teacher1.setIdTeacher(2);
		teacher1.setName("Pepe");
		teachers.add(teacher1);
		return teachers;
	}

}
