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
		
		
//		System.out.println("\n\n");
//		System.out.println(plusFour + ", " + i);
//		System.out.println(minusFour + ", " + i);
//		System.out.println(Math.floor(Math.pow(plusFour, 0.5)));
//		System.out.println(Math.pow(plusFour, 0.5));
//		System.out.println(Math.pow(Math.floor(minusFour), 0.5));
//		System.out.println(Math.floor(Math.pow(minusFour, 0.5)));

		
		if (Math.pow(plusFour, 0.5) == Math.floor(Math.pow(plusFour, 0.5)) || Math.pow(minusFour, 0.5) == Math.floor(Math.pow(minusFour, 0.5))) {
			
			return true;
		}
		
		return false;
		
		
				
		
		

		
	}



	public static boolean isFibo(String input) {
		return isFibo(new Integer(input));
	}
	
	
	

	
}
