package java8;
import java.util.function.*;
 public class Supplier1
{
	public static void main(String[] args)
	{
		Supplier supplier= ()->{
			StringBuilder sb = new StringBuilder("");
			for(int i=0;i<=5;i++)
			{
				sb.append((int)(Math.random()*10));
			}
			return sb.toString();
		};
		System.out.println(supplier.get());
		System.out.println(supplier.get());
		System.out.println(supplier.get());
		
	}
}
