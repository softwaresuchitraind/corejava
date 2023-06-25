package java8;
@FunctionalInterface
interface Wish
{
	void wishMessage();
}
public class M3
{
	public static void main(String[] args)
	{
		Wish w = ()-> System.out.println("Hello Good Morning");
		w.wishMessage();
	}
}
