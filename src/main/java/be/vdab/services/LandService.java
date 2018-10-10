package be.vdab.services;

import java.math.BigDecimal;

import repositories.LandRepository;

public class LandService {
	private final LandRepository landRepository;
	public LandService(LandRepository landRepository) {
		this.landRepository = landRepository;
	}
	public BigDecimal findVerhoudingOppervlakteAlleLanden(String landcode) {
		throw new UnsupportedOperationException();
	}
}
