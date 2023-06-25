package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class M9
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
		/*List<String> collect = list.stream().map(p->p.getName()).collect(Collectors.toList());
		System.out.println(collect);*/
	
	
}
}