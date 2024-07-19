package com.sukla.streamjavat;

public class Employee
{
	private String name;
	private Integer age;
	private Double sal;
	
	public Employee()
	{
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String name, Integer age, Double sal)
	{
		super();
		this.name = name;
		this.age = age;
		this.sal = sal;
	}

	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public Integer getAge()
	{
		return age;
	}
	public void setAge(Integer age)
	{
		this.age = age;
	}
	public Double getSal()
	{
		return sal;
	}
	public void setSal(Double sal)
	{
		this.sal = sal;
	}

	@Override
	public String toString()
	{
		return "Employee [name=" + name + ", age=" + age + ", sal=" + sal + "]";
	}
	
	

}
