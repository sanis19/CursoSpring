package com.privalia.builderexample;

public class Employee {
	private Long id;
	private String name;
	private int gender;
	private String address;
	private String hobby;
	
	private Employee(){
		
	}
	
	public static class EmployeeBuilder{
		
		private Long id;
		private String name;
		private int gender;
		private String address;
		private String hobby;
		
		public EmployeeBuilder(Long id,String name){
			this.id = id;
			this.name= name;
		}

		public void setGender(int gender) {
			this.gender = gender;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public void setHobby(String hobby) {
			this.hobby = hobby;
		}
		
		public Employee build(){
			Employee emp = new Employee();
				emp.id = id;
				emp.name = name;
				emp.gender = gender;
				emp.address =  address;
				emp.hobby = hobby;
				return emp;
			}
		}

	@Override
	public String toString() {
		
		return "Employee [id="+id+", name="+name+",gender="+(gender ==1 ? "Male" : "Female") + ", address="+address+", hobby="+hobby+"]";
	}
	
	
		
	}
