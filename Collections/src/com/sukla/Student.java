package com.sukla;

public class Student 
{
	int id;
	String name;
	
	public Student(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + "--" +name;
	}

}
