package no.vegvesen.ikt.skoleprosjekt;

public class NumberOne {
	
	public static String HalloVerden() {
		return "Hallo Verdwen!";
		
		
	}
	
	public static void main(String[] args){
		
		for (String arg : args) {
			System.out.println(arg);
		}
		
		System.out.println(HalloVerden());
		
		
		try {
			
			System.out.println(args[0]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Det er ingen args å printe! " + e.getCause());
		}
		
		
		
	}

	public static int leggSammenDisseTallene(int i, int j) {
		return i + j;
		
	}
	
	
	

}
