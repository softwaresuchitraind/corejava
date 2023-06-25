package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class M8
{
	public static void main(String[] args)
	{
		Person p1 = new Person("suchitra",36,"software");
		Person p2 = new Person("suc",36,"software");
		Person p3 = new Person("suchi",56,"sale");
		Person p4 = new Person("tra",36,"software");
		Person p5 = new Person("tra",63,"ops");
		Person p6 = new Person("ra",26,"software");
		
		List<Person> list = Arrays.asList(p1,p2,p3,p4,p5);
		/*
		boolean b1 = list.stream().anyMatch(x->x.getJob().equals("ops"));
		System.out.println(b1);
		boolean b2 = list.stream().allMatch(x->x.getJob().equals("ops"));
		System.out.println(b2);
		boolean b3 = list.stream().noneMatch(x->x.getJob().equals("ops"));
		System.out.println(b2);*/
		//Optional<Person> findFirst = list.stream().filter(x->x.getJob().equals("software")).findFirst();
		Optional<Person> findFirst = list.stream().filter(x->x.getJob().equals("software")).findAny();
		if(findFirst.isPresent())
		{
			System.out.println(findFirst.get());
		}
	
}
}