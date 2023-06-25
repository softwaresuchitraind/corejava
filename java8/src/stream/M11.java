package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class M11
{
	public static void main(String[] args)
	{
		Person p1 = new Person("suchitra",36,"software");
		Person p2 = new Person("suc",36,"software");
		Person p3 = new Person("suchi",56,"sale");
		Person p4 = new Person("tra",36,"software");
		Person p5 = new Person("tra",63,"ops");
		Person p6 = new Person("ra",26,"software");
		
		List<Person> list = Arrays.asList(p1,p2,p3,p4,p5,p6);
		//average age,min age ,mag age
		Double collect = list.stream().collect(Collectors.averagingInt(p->p.getAge()));
		System.out.println(collect);
	
		Optional<Person> collect2 = list.stream().collect(Collectors.minBy(Comparator.comparing(x->x.getAge())));
		System.out.println(collect2);
		
		Optional<Person> collect3 = list.stream().collect(Collectors.maxBy(Comparator.comparing(Person::getAge)));
		System.out.println(collect3);
	
}
}