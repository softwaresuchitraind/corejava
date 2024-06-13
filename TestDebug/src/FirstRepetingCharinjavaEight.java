import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.IntStream;

public class FirstRepetingCharinjavaEight
{
	public static void main(String[] args)
	{
		String s = "hello";
		Optional<Character> firestRepeatingChar = firestRepeatingChar(s);
		if(firestRepeatingChar.isPresent())
		{
			System.out.println("First Repeting char  "+firestRepeatingChar.get());
		}
		else
		{
			System.out.println("No Repeting char");
		}
		
	}

	private static Optional<Character> firestRepeatingChar(String s)
	{
		Set<Character> seen = new HashSet<>();
		return IntStream.range(0, s.length())
						.mapToObj(s::charAt)
						.filter(ch->!seen.add(ch))
						.findFirst();
		
	}

}
