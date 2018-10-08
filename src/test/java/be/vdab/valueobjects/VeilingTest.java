package be.vdab.valueobjects;

import static org.junit.Assert.*;

import org.junit.Test;

public class VeilingTest {

	@Test
	public void hoogsteBodZonderBodIs0() {
		Veiling veiling = new Veiling();
		assertEquals(0, veiling.hoogsteBod());
	}
	@Test
	public void hoogsteBodIsEersteBodBij1Bod() {
		Veiling veiling = new Veiling();
		veiling.doeBod(1000);
		assertEquals(1000, veiling.hoogsteBod());
	}
	@Test
	public void hoogsteBodIsHoogsteBodBijMeerdereBoden() {
		Veiling veiling = new Veiling();
		veiling.doeBod(1000);
		veiling.doeBod(2000);
		assertEquals(2000, veiling.hoogsteBod());
	}

}
