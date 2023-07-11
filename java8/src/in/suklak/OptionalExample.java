package in.suklak;

import java.util.Optional;

public class OptionalExample
{
	public static void main(String[] args)
	{
		Optional<String> s= display("Hi");
		System.out.println(s.isPresent());
		if(s.isPresent())
		{
			System.out.println("not null");
		}
		 
		else
		{
			System.out.println("null");
		}
		 
	}

	private static Optional<String> display(String i)
	{
		Optional<String> op = Optional.ofNullable(i);
		
		return op;
		
	}

}
