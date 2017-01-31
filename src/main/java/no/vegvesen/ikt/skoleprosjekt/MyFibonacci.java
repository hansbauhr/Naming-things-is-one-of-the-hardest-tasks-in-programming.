package no.vegvesen.ikt.skoleprosjekt;

import java.util.ArrayList;
import java.util.List;

public class MyFibonacci {

	public String lagFibonacciStrengMed(int input) {
		// TODO Auto-generated method stub

		String answer = "0";
		
		for (int i = 1; i <= input; i++) {
			
			answer += "," + fib(i);
			
			
		}
		
		
		return answer;

	}

	int fib(int n) {

		if (n < 2) {
			return n;
		}

		return fib(n - 1) + fib(n - 2);

	}
	
	
	public List<Integer> lagFibonacciListMed(int input) {
		
		List<Integer> answer = new ArrayList<>();
		
		answer.add(0);
		
		
		for (int i = 1; i <= input; i++) {
			
			
		
		answer.add(fib(i));
		}
		
		//System.out.println(answer);
	
		return answer;
		
	}

}
