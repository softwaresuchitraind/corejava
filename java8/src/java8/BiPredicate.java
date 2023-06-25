package java8;

public class BiPredicate
{
	public static void main(String[] args)
	{
		java.util.function.BiPredicate<String,Integer> filter =(x,y)->{
			return x.length()==y;
		};
		
		boolean results =filter.test("Suchit",6);
		System.out.println(results);
	}
}
