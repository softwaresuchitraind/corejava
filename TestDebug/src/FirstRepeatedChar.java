import java.util.HashSet;

public class FirstRepeatedChar
{
	public static void main(String[] args)
	{
		String s1 = "helo";
		
		
		Character s2 =firstRepeatingChar(s1);
		System.out.println(s2);
		
	}

	private static Character  firstRepeatingChar(String s1)
	{
		HashSet<Character> hashSet = new HashSet<>();
		for (char c : s1.toCharArray())
		{
			if(hashSet.contains(c))
			{
				
				return c;
			}
			hashSet.add(c);
		}
		return null;
		
	}

}
