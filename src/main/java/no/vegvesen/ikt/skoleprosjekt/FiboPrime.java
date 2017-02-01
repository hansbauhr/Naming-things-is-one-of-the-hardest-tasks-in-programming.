package no.vegvesen.ikt.skoleprosjekt;

public class FiboPrime {

	public static Boolean isFiboPrime(int i) {
		
		
		
		if (MyPrimeNumbers.isPrime(i) && isFibo(i)) {
			
			return true;
		}
		
		
		
		
		return false;
		
		
		
		
	}
	
	
	
	public static Boolean isFibo(int i) {
		
		
		
		Double plusFour = 5*Math.pow(i, 2) + 4;
		Double minusFour = 5*Math.pow(i, 2) - 4;
		
		if (plusFour == Math.floor(plusFour) || minusFour == Math.floor(minusFour)) {
			
			return true;
		}
		
		return false;
		
		
				
		
		

		
	}
	
	
	

	
}
