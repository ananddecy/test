package org.cuke.salary;

public class Employee {
	
	private int id;
	private String user;
	private float salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
	public String toString(){
		
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [ID: ").append(id).append(", user: ").append(user).append(", salary: ").append(salary);
		return builder.toString();
	}

}
