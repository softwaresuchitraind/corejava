package java8;

import java.util.function.Supplier;

class Sample
{
	public Sample()
	{
		System.out.println("Sample class constructor");
	}
}
public class M15
{
	public static void main(String[] args)
	{
		Supplier<Sample> sup = Sample::new;
		System.out.println(sup.get().hashCode());
	}
}
