package no.vegvesen.ikt.skoleprosjekt;

import static org.junit.Assert.*;

//import java.math.BigDecimal;

import org.junit.Test;

public class NumberOneTest {

	@Test
	public void test() {
		
		String tekst = NumberOne.HalloVerden();
		assertEquals("Hallo verden!", tekst);
		
	}
	
	@Test
	public void skal_bare() throws Exception {
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
	public void skal_finne_de_20_føreste_desimaler_på_pi() throws Exception {
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
	public void skal_regne_ut_fibonacci() throws Exception {
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
	

}
