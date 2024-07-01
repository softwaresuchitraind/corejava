package com.interview1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee
{
	String id;
	String name;
	String dept;
	public Employee(String id, String name, String dept)
	{
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	@Override
	public String toString()
	{
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getDept()
	{
		return dept;
	}
	public void setDept(String dept)
	{
		this.dept = dept;
	}
	
	
}
public class Test
{
	

	public static void main(String[] args)
	{
		Employee e1 = new Employee("1","Sam","HR");
		Employee e2 = new Employee("2","SUCH","SALES");
		Employee e3 = new Employee("3","KAJU","HR");
		Employee e4 = new Employee("4","sUCH","SALES");
		List<Employee> employess = Arrays.asList(e1,e2,e3,e4);
		
		employess.stream()
				 .collect(Collectors.groupingBy(Employee::getDept,
						 Collectors.mapping(Employee::getName, Collectors.toList())))
				 .entrySet().stream().filter(x->x.getKey().equalsIgnoreCase("HR")).forEach(x->
				 {
					 System.out.println(x.getKey()+"->"+x.getValue());
				 });
				 
						 
						
		
		
	}
}
