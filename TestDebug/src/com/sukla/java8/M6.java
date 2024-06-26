package com.sukla.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class M6
{
	public static void main(String[] args)
	{
		//List<Integer> list = Arrays.asList(10,20,30,34,4);
		//list.stream().filter(x->x>20).forEach(i->System.out.println(i));
		User u1 = new User("john",15);
		User u2 = new User("Jack",16);
		User u3 = new User("Suchitra",25);
		User u4 = new User("Aam",35);
		
		Stream<User> stream = Stream.of(u1,u2,u3,u4);
		//stream.filter(x->x.age>=18).forEach(i->System.out.println(i));
		//stream.filter(x->x.age>=18 && x.name.startsWith("S") ).forEach(i->System.out.println(i));
		stream.filter(x->x.age>=18).filter( x-> x.name.startsWith("S")).forEach(i->System.out.println(i));
	}

}
class User
{
	String name;
	int age;
	public User(String name, int age)
	{
		
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString()
	{
		return "User [name=" + name + ", age=" + age + "]";
	}
	
	
}
