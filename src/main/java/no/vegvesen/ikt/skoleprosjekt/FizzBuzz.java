package no.vegvesen.ikt.skoleprosjekt;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static List<String> fizzBuzz(int input) {
		
		
		
		List<String> answer = new ArrayList<>();
		
		for (int i = 1; i < input; i++) {
			
			if (i%5 == 0 && i%3 == 0) {
				
				answer.add("FizzBuzz");
			}
			
			else if (i%5 == 0) {
				answer.add("Buzz");
			}
			
			else if (i%3 == 0) {
				answer.add("Fizz");
			}
			else {
				String temp = String.valueOf(i);
				answer.add(temp);
			}
			
			//answer.add(", ");
		
		}
		
		
		return answer;
		
		
		
		
	}

}
