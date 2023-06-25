package java8;

import java.util.function.Predicate;

public class PredicateJoining
{
	static boolean isPesonIlligibleForVoting(Person person, Predicate<Person> predicate)
	{
		return predicate.test(person);
	}
	public static void main(String[] args)
	{
		Person person = new Person("Suchitra",61);
		Predicate<Person> agegreater = (p)->p.age>18;
		Predicate<Person> agelesser = (p)->p.age<60;
		Predicate<Person> predicate = agegreater.and(agelesser);
		boolean pesonIlligibleForVoting = isPesonIlligibleForVoting(person,predicate);
		System.out.println(pesonIlligibleForVoting);
	}
}
