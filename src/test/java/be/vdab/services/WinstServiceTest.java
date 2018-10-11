package be.vdab.services;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import be.vdab.repositories.KostRepository;
import be.vdab.repositories.OpbrengstRepository;

@RunWith(MockitoJUnitRunner.class)
public class WinstServiceTest {
	@Mock OpbrengstRepository opbrengstRepository;
	@Mock KostRepository kostRepository;
	WinstService winstService;
	@Before
	public void before() {
		when(opbrengstRepository.findTotaleOpbrengst()).thenReturn(BigDecimal.valueOf(10));
		when(kostRepository.findTotaleKost()).thenReturn(BigDecimal.valueOf(5));
		winstService = new WinstService(opbrengstRepository, kostRepository);
	}
	@Test
	public void deTotaleWinstIsTotaleOpbrengstMinTotaleKost() {
		assertEquals(0, winstService.getWinst().compareTo(BigDecimal.valueOf(5)));
		verify(opbrengstRepository).findTotaleOpbrengst();
		verify(kostRepository).findTotaleKost();
	}

}
