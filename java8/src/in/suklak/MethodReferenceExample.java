package in.suklak;

public class MethodReferenceExample
{
	public static void main(String[] args)
	{
		MethodReferenceExample mr = new MethodReferenceExample();
		
		Test t = (y,y1) ->MethodReferenceExample.show(y,y1);
		
		Test t1 = MethodReferenceExample::show;
		
		Test t3 = (y,y1)->mr.add(y,y1);
		Test t4 = mr::add;
		
	}
	
	static void show(int i,int j)
	{
		int c = i+1000;
		int x = (i*10)/100;
		System.out.println(x);
	}
	
	 void add(int i, int j)
	{
		int c = i+1000;
		int x = (i*10)/100;
		System.out.println(x);
	}
}
