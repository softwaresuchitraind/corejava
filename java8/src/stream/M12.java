package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class M12
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
		
		Map<String, List<Person>> collect = list.stream().collect(Collectors.groupingBy(Person::getJob));
		System.out.println(collect);
}
}