package com.privalia.entity.listas;

import java.util.List;



public class Student {
	
	private int idStudent;
	private String name;
	private String surname;
	private int age;
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
