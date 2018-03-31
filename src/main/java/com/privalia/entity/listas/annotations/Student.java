package com.privalia.entity.listas.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;



public class Student {
	
	@Autowired
	@Value("1")
	private int idStudent;
	@Autowired
	@Value("David")
	private String name;
	@Autowired
	@Value("Soto")
	private String surname;
	@Autowired
	@Value("24")
	private int age;
	@Autowired
	@Qualifier("listTeacher") //para cargar una clase
	private List<Teacher> listTeacher;
	
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

	public List<Teacher> getListTeacher() {
		return listTeacher;
	}

	public void setListTeacher(List<Teacher> listTeacher) {
		this.listTeacher = listTeacher;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int idStudent, String name, String surname, int age, List<Teacher> listTeacher) {
		super();
		this.idStudent = idStudent;
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.listTeacher = listTeacher;
	}

	@Override
	public String toString() {
		return (new StringBuilder()).append("[#")
				.append(this.idStudent)
				.append(", ")
				.append(this.name)
				.append(", ")
				.append(this.surname)
				.append(", ")
				.append(this.listTeacher.toString())
				.append("]")
				.toString();
	}
	
	

}
