package no.vegvesen.ikt.skoleprosjekt;

public class NumberOne {
	
	public static String HalloVerden() {
		return "Hallo Verdwen!";
		
		
	}
	
	public static void main(String[] args){
		
		//for (String arg : args) {
		//	System.out.println(arg);
		//}
		
		System.out.println(HalloVerden());
		
		
		try {
			
			if (MyPrimeNumbers.isPrime(new Integer(args[0]))) {
				
				print(args[0] + " is prime!");
				
			}
			else {
				print(args[0] + " is not prime!");
				
			}

			
			
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Det er ingen args å printe! " + e.getCause());
		}
		
		
		
	}

	private static void print(String string) {
		System.out.println(string);
		
	}

	public static int leggSammenDisseTallene(int i, int j) {
		return i + j;
		
	}
	
	
	

}
