package org.spring.batch.springBatchexample.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	private Integer Id;
	private String name;
	private String dept;
	private Integer salary;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer id, String name, String dept, Integer salary) {
		super();
		Id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "User [Id=" + Id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	

}
