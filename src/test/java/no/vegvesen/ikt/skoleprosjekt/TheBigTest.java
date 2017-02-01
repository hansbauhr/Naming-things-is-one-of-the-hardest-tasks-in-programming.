package no.vegvesen.ikt.skoleprosjekt;

import static org.junit.Assert.*;

import java.util.List;

//import java.math.BigDecimal;

import org.junit.Test;

public class TheBigTest {

	@Test
	public void test() {
		
		String tekst = NumberOne.HalloVerden();
		assertEquals("Hallo Verdwen!", tekst);
		
	}
	
	@Test
	public void skal_bare() {
		int sum = NumberOne.leggSammenDisseTallene(2,2);
		assertEquals(4, sum);
	}
	
	@Test
	public void skal_finne_roten() throws Exception {
		
		double noe = TheRoot.finnRoten(4);
		assertEquals(2, noe, 0);
		
		double noe2 = TheRoot.finnRoten(2);
		assertEquals(1.414, noe2, 0.01);
		
		double noe3 = TheRoot.finnRoten(9);
		//System.out.println(noe3);
		assertEquals(3, noe3, 0);
		
	}
	
	@Test
	public void skal_finne_de_20_føreste_desimaler_på_pi() {
		//fail("Not yet implemented!");
		//BigDecimal pi = ThePi.finnPi();
		
		//double expected = 3.14159265358979323846;
		//BigDecimal expected = BigDecimal.valueOf(3.14159265358979323846);
		
		//System.out.println(pi + " = pi calc");
		//System.out.println(expected + " = pi expected");
		
		
		String pi_streng = ThePi.PiStreng();
		assertEquals("3.14159265358979323846", pi_streng);
		
		
		
		
	}
	
	@Test
	public void skal_regne_ut_fibonacci() {
		String svar1 = "0,1,1,2";
		String svar2 = "0,1,1,2,3,5,8,13,21,34";
		String svar3 = "0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,2584,4181,6765";
		
		String fibo1 = new MyFibonacci().lagFibonacciStrengMed(3);
		String fibo2 = new MyFibonacci().lagFibonacciStrengMed(9);
		String fibo3 = new MyFibonacci().lagFibonacciStrengMed(20);
		
		assertEquals(svar1, fibo1);
		assertEquals(svar2, fibo2);
		assertEquals(svar3, fibo3);
	}
	
	@Test
	public void må_teste_litt_mer() throws Exception {
		
		int fib = new MyFibonacci().fib(0);
		assertEquals(0, fib);
		
		int fib1 = new MyFibonacci().fib(5);
		assertEquals(5, fib1);
	}
	
	
	
	@Test
	public void fiboList() {
		
//		List svar1 = Arrays.asList(0,1,1,2);
//		List svar2 = Arrays.asList(0,1,1,2,3,5,8,13,21,34);
//		List svar3 = Arrays.asList(0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,2584,4181,6765);
		
		
		List<Integer> fibo1 = new MyFibonacci().lagFibonacciListMed(3);
		List<Integer> fibo2 = new MyFibonacci().lagFibonacciListMed(9);
		List<Integer> fibo3 = new MyFibonacci().lagFibonacciListMed(20);
		
		assertEquals(fibo1.size(), 4);
		assertEquals(fibo1.get(0), Integer.valueOf(0));
		assertEquals(fibo1.get(1), Integer.valueOf(1));
		assertEquals(fibo1.get(2), Integer.valueOf(1));
		assertEquals(fibo1.get(3), Integer.valueOf(2));
		
		assertEquals(fibo2.size(), 10);
		assertEquals(fibo3.size(), 21);
		
		
	}
	
	
	@Test
	public void primTall() {

		Boolean svar1 = MyPrimeNumbers.isPrime(3);
		Boolean svar2 = MyPrimeNumbers.isPrime(2);
		Boolean svar3 = MyPrimeNumbers.isPrime(16);
		Boolean svar4 = MyPrimeNumbers.isPrime(20);
				
		assertEquals(true, svar1);
		assertEquals(true, svar2);
		assertEquals(false, svar3);
		assertEquals(false, svar4);
		
	}
	
	@Test
	public void primeList() {
		
		String svar1 = "2,3";
		String svar2 = "2,3,5,7";
		String svar3 = "2,3,5,7,11,13";
		
		assertEquals(svar1, MyPrimeNumbers.primeList(3));
		assertEquals(svar2, MyPrimeNumbers.primeList(10));
		assertEquals(svar3, MyPrimeNumbers.primeList(15));
	
	}
	
	@Test
	public void skal_sjekke__fibo_prime() {
		
		Boolean svar1 = FiboPrime.isFiboPrime(2);
		Boolean svar2 = FiboPrime.isFiboPrime(89);
		Boolean svar3 = FiboPrime.isFiboPrime(47);
		Boolean svar4 = FiboPrime.isFiboPrime(99);
		Boolean svar5 = FiboPrime.isFiboPrime(144);
		Boolean svar6 = FiboPrime.isFiboPrime(28657);
		Boolean svar7 = FiboPrime.isFiboPrime(514229);
		
		
		
		assertEquals(svar1, true);
		assertEquals(svar2, true);
		assertEquals(svar3, true);
		assertEquals(svar4, false);
		assertEquals(svar5, false);
		assertEquals(svar6, true);
		assertEquals(svar7, true);
		
		
		
		

	}
	

}
