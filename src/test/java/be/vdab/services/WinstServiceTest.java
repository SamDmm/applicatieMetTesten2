package be.vdab.services;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import be.vdab.repositories.KostRepository;
import be.vdab.repositories.KostRepositoryStub;
import be.vdab.repositories.OpbrengstRepository;
import be.vdab.repositories.OpbrengstRepositoryStub;

public class WinstServiceTest {
	OpbrengstRepository opbrengstRepository;
	KostRepository kostRepository;
	WinstService winstService;
	@Before
	public void before() {
		opbrengstRepository = new OpbrengstRepositoryStub();
		kostRepository = new KostRepositoryStub();
		winstService = new WinstService(opbrengstRepository, kostRepository);
	}
	@Test
	public void deTotaleWinstIsTotaleOpbrengstMinTotaleKost() {
		assertEquals(5, winstService.getWinst());
	}

}
