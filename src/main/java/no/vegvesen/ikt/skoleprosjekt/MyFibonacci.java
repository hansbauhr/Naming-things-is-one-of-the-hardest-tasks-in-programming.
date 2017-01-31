package no.vegvesen.ikt.skoleprosjekt;

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

}
