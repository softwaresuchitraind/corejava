package java8;
interface Vehicle1
{
	static void cleanVehicle()
	{
		System.out.println("Clean vehicle");
	}
}
public class M2 implements Vehicle1
{
	public static void main(String[] args)
	{
		Vehicle1.cleanVehicle();
	}
}
