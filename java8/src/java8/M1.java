package java8;

interface Vehicle
{
	void cleanVehicle();
	default void startVehicle() {
		System.out.println("Vehicle is Starting...........");
	}
}
public class M1 implements Vehicle
{
	@Override
	public void cleanVehicle()
	{
		System.out.println("Clean Vehicle info...........");
		
	}
	public static void main(String[] args)
	{
		M1 m1 = new M1();
		m1.cleanVehicle();
		m1.startVehicle();
	}
}
