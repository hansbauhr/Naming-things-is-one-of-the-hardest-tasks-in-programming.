package no.vegvesen.ikt.skoleprosjekt;



public class MyPrimeNumbers {

	public static Boolean isPrime(int input) {
		
		if (input == 2) {
			return true;
		}
		
		for (int i = 2; i <= Math.floor(TheRoot.finnRoten(input)) +  1; i++) {
			
			
			
			if (input % i == 0) {
				return false;
			}
			
		}
		
		
		
		
		return true;
	}
	
	
	public static String primeList(int input) {
		
		String answer = "2";
		
		for (int i = 3; i <= input; i++) {
			
			if (isPrime(i)){
				
				answer += "," + i;
						
			}
			
		}
		
		
		return answer;
				
	}

}
