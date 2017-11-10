package io;

import java.io.Serializable;

public class Employee  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	int age;
	String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Employee(String name, int age, String email) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", email=" + email
				+ "]";
	}
	
	
}
