package java8;

import java.util.Optional;

public class M20
{
	public static void main(String[] args)
	{
		String wd[] = new String[10];
		Optional<String> opt= Optional.ofNullable(wd[5]);
		if(opt.isPresent())
		{
			System.out.println(wd[5]);
		}
		else
			System.out.println("Null present");
	}
}
