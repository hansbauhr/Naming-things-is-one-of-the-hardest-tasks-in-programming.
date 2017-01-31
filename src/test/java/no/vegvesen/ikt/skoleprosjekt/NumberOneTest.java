package no.vegvesen.ikt.skoleprosjekt;

import static org.junit.Assert.*;


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
		assertEquals(3, noe3, 0);
	}
	

}
