package be.vdab.services;

import java.math.BigDecimal;

import be.vdab.repositories.LandRepository;

public class LandService {
	private final LandRepository landRepository;
	public LandService(LandRepository landRepository) {
		this.landRepository = landRepository;
	}
	public BigDecimal findVerhoudingOppervlakteAlleLanden(String landcode) {
		int oppervlakteLand = landRepository.read(landcode).getOppervlakte();
		int oppervlakteAlleLanden = landRepository.findOppervlakteAlleLanden();
		return (BigDecimal.valueOf(oppervlakteLand)).divide(BigDecimal.valueOf(oppervlakteAlleLanden));
	}
}
