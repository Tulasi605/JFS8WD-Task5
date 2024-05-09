package TASK5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class studentnames {
	public static void main(String[] args) {
	List<String> studnames = Arrays.asList("Arjun","Bunny","Charlie","Alexa","ankitha","deepak");
	List<String> specialgift = studnames.stream().filter(name->name.startsWith("A"))
												.collect(Collectors.toList());
	System.out.println("Students eligible for special gifts (names starting with 'A'):");
	specialgift.forEach(System.out::println);
	}
}
