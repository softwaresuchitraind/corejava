import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 
 * @author Suchitra
 * find the first non-repeated character in it using java8
	String s="abcabcdt"
 *
 */
public class NonRepet {
    public static void main(String[] args) {
        String s = "abcabcdt";

        char firstNonRepeatedChar = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse('\0');  // Default value if no non-repeated character is found

        System.out.println("First non-repeated character: " + firstNonRepeatedChar);
    }
}

