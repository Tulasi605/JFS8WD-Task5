package TASK5;

import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class uppercaseconverter {
	 public static void main(String[] args) {
	        Stream<String> stream = Stream.of("aBc", "d", "ef");

	        List<String> uppercaseList = stream.map(String::toUpperCase).collect(Collectors.toList());

	        System.out.println(uppercaseList);
	    }
}
