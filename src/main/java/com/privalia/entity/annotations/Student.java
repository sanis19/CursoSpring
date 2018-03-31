package com.privalia.entity.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Component;

@Component(value= "student")
@PropertySource("classpath:config.properties")

public class Student {
	public int getIdStudent() {
		return idStudent;
	}


	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}

	@Autowired
	@Value("${student.idstudent}")
	private int idStudent;
	@Autowired
	@Value("${student.name}")
	private String name;
	@Autowired
	@Value("${student.surname}")
	private String surname;
	@Autowired
	@Value("${student.age}")
	private int age;
	
	@Autowired
	@Qualifier("address") //para cargar una clase
	private Address address;
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(int idStudent, String name, String surname, int age, Address address) {
		super();
		this.idStudent = idStudent;
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.address = address;
	}
	
	@Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
