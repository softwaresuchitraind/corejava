package com.sukla.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmpData
{
	public static void main(String[] args)
	{
		List<EmployeeData> empList = new ArrayList<EmployeeData>();
        
		empList.add(new EmployeeData(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
		empList.add(new EmployeeData(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
		empList.add(new EmployeeData(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
		empList.add(new EmployeeData(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
		empList.add(new EmployeeData(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
		empList.add(new EmployeeData(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));
		empList.add(new EmployeeData(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
		empList.add(new EmployeeData(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
		empList.add(new EmployeeData(9, "Gita", 24, "Female", "Sales", 2016, 11500.0));
		empList.add(new EmployeeData(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5));
		empList.add(new EmployeeData(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));
		empList.add(new EmployeeData(12, "Nithin", 25, "Male", "Development", 2016, 28200.0));
		empList.add(new EmployeeData(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
		empList.add(new EmployeeData(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5));
		empList.add(new EmployeeData(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0));
		empList.add(new EmployeeData(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));

		//System.out.println(empList);
		
		//How many male and female Employees are there in the organisation
		Map<String, Long> collect = empList.stream().collect(Collectors.groupingBy(EmployeeData::getGender,Collectors.counting()));
		//System.out.println(collect);
		//Print the names of all depts in the organisation.
		/*
		empList.stream().map(EmployeeData::getDepartment)
						.distinct()
						.forEach(e->System.out.println(e));*/
		
		//print average age of all male and female employess
		
		Map<String, Double> collect2 = empList.stream().collect(Collectors.groupingBy(EmployeeData::getGender,Collectors.averagingInt(EmployeeData::getAge)));
		//System.out.println(collect2);
		
		//Get the details of hight paid Employee in the organisation
		
		Optional<EmployeeData> collect3 = empList.stream().collect(Collectors.maxBy(Comparator.comparing(EmployeeData::getSalary)));
		if(collect3.isPresent())
		{
			//System.out.println(collect3.get());
		}
		
		
		//Get the names of employee who joined after 2015
		//empList.stream().filter(x->x.yearOfJoining>2015).map(x->x.name).forEach(x->System.out.println(x));
		
		//count the number of employees in each dept
		Map<String, Long> collect4 = empList.stream().collect(Collectors.groupingBy(EmployeeData::getDepartment,Collectors.counting()));
		//System.out.println(collect4);
		
		//calculate the average salary of each dept
		
		Map<String, Double> collect5 = empList.stream().collect(Collectors.groupingBy(EmployeeData::getDepartment,Collectors.averagingDouble(EmployeeData::getSalary)));
		//System.out.println(collect5);
		
		//Get the details of youngest male employee in the developement department
		
		Optional<EmployeeData> min = empList.stream().filter(e->e.getGender().equalsIgnoreCase("male") && e.getDepartment().equalsIgnoreCase("Development"))
				.min(Comparator.comparing(EmployeeData::getAge));
		
		if(min.isPresent())
		{
			//System.out.println(min.get());
		}
		
		//Who is the most experienced person in the organisation
		
		Optional<EmployeeData> min2 = empList.stream().min(Comparator.comparing(EmployeeData::getYearOfJoining));
		if(min2.isPresent())
		{
			//System.out.println(min2.get());
		}
		
		//How many males and female employees are there in sales team
		
		Map<String, Long> collect6 = empList.stream()
					.filter(e->e.getDepartment().equals("Sales"))
					.collect(Collectors.groupingBy(EmployeeData::getGender,Collectors.counting()));
		//System.out.println(collect6);
		
		
		//Employee has the hightest Salary
		
		Optional<EmployeeData> collect7 = empList.stream().collect(Collectors.maxBy(Comparator.comparing(x->x.getSalary())));
		//System.out.println(collect7.get());
		
		//2nd highest salary
		
		Optional<Double> first = empList.stream().map(x->x.getSalary()).sorted(Collections.reverseOrder()).limit(2).skip(1).findFirst();
		//System.out.println(first);
		Optional<EmployeeData> first2 = empList.stream().sorted(Comparator.comparing(EmployeeData::getSalary).reversed()).skip(1).findFirst();
		//System.out.println(first2);
		List<EmployeeData> collect8 = empList.stream().sorted(Comparator.comparing(EmployeeData::getSalary).reversed()).collect(Collectors.toList());
		System.out.println(collect8.get(1));
	}
}
class EmployeeData
{
    int id;
    String name;
    int age;
    String gender;
    String department;
    int yearOfJoining;
    double salary;
	public EmployeeData(int id, String name, int age, String gender, String department, int yearOfJoining, double salary)
	{
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
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
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public String getGender()
	{
		return gender;
	}
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	public String getDepartment()
	{
		return department;
	}
	public void setDepartment(String department)
	{
		this.department = department;
	}
	public int getYearOfJoining()
	{
		return yearOfJoining;
	}
	public void setYearOfJoining(int yearOfJoining)
	{
		this.yearOfJoining = yearOfJoining;
	}
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	@Override
	public String toString()
	{
		return "EmployeeData [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}
     
	
}
