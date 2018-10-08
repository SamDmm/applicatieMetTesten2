package be.vdab.valueobjects;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VeilingTest {
	Veiling veiling;
	@Before
	public void before() {
		veiling = new Veiling();
	}
	@Test
	public void hoogsteBodZonderBodIs0() {
		assertEquals(0, veiling.hoogsteBod());
	}
	@Test
	public void hoogsteBodIsEersteBodBij1Bod() {
		veiling.doeBod(1000);
		assertEquals(1000, veiling.hoogsteBod());
	}
	@Test
	public void hoogsteBodIsHoogsteBodBijMeerdereBoden() {
		veiling.doeBod(1000);
		veiling.doeBod(2000);
		assertEquals(2000, veiling.hoogsteBod());
	}

}
