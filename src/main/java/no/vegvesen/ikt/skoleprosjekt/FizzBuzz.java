package no.vegvesen.ikt.skoleprosjekt;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {

	public static List<String> fizzBuzz(int input) {
		
		return (List<String>) IntStream
								.range(1, input)
								.mapToObj(i -> i % 15 == 0 ? "FizzBuzz" : i % 5 == 0 ? "Buzz" : i % 3 == 0 ? "Fizz" : String.valueOf(i))
								.collect(Collectors.toList());
		
//		List<String> answer = new ArrayList<>();
//		
//		for (int i = 1; i < input; i++) {
//			
//			if (i%5 == 0 && i%3 == 0) {
//				
//				answer.add("FizzBuzz");
//			}
//			
//			else if (i%5 == 0) {
//				answer.add("Buzz");
//			}
//			
//			else if (i%3 == 0) {
//				answer.add("Fizz");
//			}
//			else {
//				String temp = String.valueOf(i);
//				answer.add(temp);
//			}
//			
//			//answer.add(", ");
//		
//		}
//		
//		
//		return answer;
//		
		
		
		
	}

}
