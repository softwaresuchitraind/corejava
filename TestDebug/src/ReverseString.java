import java.util.Iterator;

public class ReverseString
{
	public static void main(String[] args)
	{
		String s1 = "hello";
		System.out.println(reverse(s1));
	}

	private static String reverse(String s1)
	{
		char[] s3 = s1.toCharArray();
		String s2 = "";
		for(int i=s3.length-1;i>=0;i--)
		{
			s2+=s3[i];
		}
		return s2;
	}

	

}
