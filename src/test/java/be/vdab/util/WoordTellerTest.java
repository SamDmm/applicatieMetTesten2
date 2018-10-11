package be.vdab.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WoordTellerTest {
	WoordTeller woordTeller;
	@Before
	public void before() {
		woordTeller = new WoordTeller();
	}
	@Test
	public void eenLegeStringTelt0Woorden() {
		assertEquals(0, woordTeller.telWoorden(""));
	}
	@Test(expected = NullPointerException.class)
	public void ingaveNullGeeftException() {
		assertEquals(0, woordTeller.telWoorden(null));
	}
	@Test
	public void enkelEenSpatieGeeft0() {
		assertEquals(0, woordTeller.telWoorden(" "));
	}
	@Test
	public void enkelMeerdereSpatiesGeeft0() {
		assertEquals(0, woordTeller.telWoorden("   "));
	}
	@Test
	public void enkelEenWoordGeeftEen() {
		assertEquals(1, woordTeller.telWoorden("woord"));
	}
	@Test
	public void tweeWoordenGevenTwee() {
		assertEquals(2, woordTeller.telWoorden("woord woord"));
	}
	@Test
	public void eenSpatieEnEenWoordGeeftEen() {
		assertEquals(1, woordTeller.telWoorden(" woord"));
	}
	@Test
	public void eenWoordEnEenSpatieGeeftEen() {
		assertEquals(1, woordTeller.telWoorden("woord "));
	}
	@Test
	public void eenSpatieEnEenWoordEnEenSpatieGeeftEen() {
		assertEquals(1, woordTeller.telWoorden(" woord "));
	}
	@Test
	public void eenSpatieEnEenWoordEnEenSpatieEnEenWoordGeeftTwee() {
		assertEquals(2, woordTeller.telWoorden(" woord woord"));
	}
	@Test
	public void eenWoordEnEenSpatieEnEenWoordEnEenSpatieGeeftTwee() {
		assertEquals(2, woordTeller.telWoorden("woord woord "));
	}
	@Test
	public void eenSpatieEnEenWoordEnEenSpatieEnEenWoordEnEenSpatieGeeftTwee() {
		assertEquals(2, woordTeller.telWoorden(" woord woord "));
	}
	@Test
	public void enkelKomma() {
		assertEquals(0, woordTeller.telWoorden(","));
	}
	@Test
	public void woordenGescheidenDoorKomma() {
		assertEquals(2, woordTeller.telWoorden("woord,woord"));
	}
	@Test
	public void woordenGescheidenDoorTweeKommas() {
		assertEquals(2, woordTeller.telWoorden("woord,,woord"));
	}
	@Test
	public void enkelMeerdereKommas() {
		assertEquals(0, woordTeller.telWoorden(",,,"));
	}
	@Test
	public void enkelSpatiesEnKommas() {
		assertEquals(0, woordTeller.telWoorden(" , ,, ,"));
	}
	@Test
	public void woordenGescheidenDoorSpatieEnKomma() {
		assertEquals(2, woordTeller.telWoorden("woord ,woord"));
	}
	@Test
	public void woordenGescheidenDoorKommaEnSpatie() {
		assertEquals(2, woordTeller.telWoorden("woord, woord"));
	}

}
