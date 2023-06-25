package stream;

import java.util.Arrays;
import java.util.List;

public class M4
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
		//list.stream().filter(x->x.getAge()>20 && x.getAge()<60 && x.getJob().equals("sale")).forEach(System.out::println);
		list.stream().filter(x->x.getJob().equals("ops")).map(x->x.getName() +"::"+x.getAge()).forEach(System.out::println);
	}
}
