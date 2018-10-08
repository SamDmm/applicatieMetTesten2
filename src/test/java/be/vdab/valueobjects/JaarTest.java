package be.vdab.valueobjects;

import static org.junit.Assert.*;
import org.junit.Test;

public class JaarTest {

	@Test
	public void eenJaarDeelbaarDoor400IsEenSchrikkeljaar() {
		Jaar jaar = new Jaar(2000);
		assertTrue(jaar.isSchrikkeljaar());
	}
	@Test
	public void eenJaarDeelbaarDoor100IsGeenSchrikkeljaar() {
		Jaar jaar = new Jaar(1900);
		assertFalse(jaar.isSchrikkeljaar());
	}
	@Test
	public void eenJaarDeelbaarDoor4IsEenSchrikkeljaar() {
		Jaar jaar = new Jaar(2012);
		assertTrue(jaar.isSchrikkeljaar());
	}
	@Test
	public void eenJaarNietDeelbaarDoor4IsGeenSchrikkeljaar() {
		Jaar jaar = new Jaar(2015);
		assertFalse(jaar.isSchrikkeljaar());
	}

}
