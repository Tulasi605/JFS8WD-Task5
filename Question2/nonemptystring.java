package TASK5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class nonemptystring {
	public static void main(String[] args) {
        List<String> listStrings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        // Filter out empty strings
        List<String> nonEmptyStrings = listStrings.stream()
                .filter(str -> !str.isEmpty()).collect(Collectors.toList());
        
        System.out.println("List of non-empty strings: " + nonEmptyStrings);
    }
}
