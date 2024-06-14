import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString8
{
	public static void main(String[] args)
	{
		String s1 = "hello";
		System.out.println(reverse(s1));
	}

	private static String reverse(String s1)
	{
		/*
		return new StringBuilder(s1)
				.chars()
				.mapToObj(ch->(char)ch)
				.collect(Collectors.collectingAndThen(Collectors.toList(),
				x->{
					java.util.Collections.reverse(x);
					return x.stream();
				}))
				.map(Object::toString)
				.collect(Collectors.joining());
				*/
		 return IntStream.rangeClosed(1, s1.length())
				 
				 .mapToObj(i->s1.charAt(s1.length()-i))
				 .map(Object::toString)
				 .collect(Collectors.joining());
		}

	

}
