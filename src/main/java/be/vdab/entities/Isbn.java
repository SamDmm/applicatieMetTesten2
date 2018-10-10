package be.vdab.entities;

import java.util.HashSet;
import java.util.Set;

public class Isbn {
	private static final long KLEINSTE_GETAL_MET_13_CIJFERS = 1000_000_000_000L;
	private static final long GROOTSTE_GETAL_MET_13_CIJFERS = 9999_999_999_999L;
	private static final Set<Short> MOGELIJKE_EERSTE_3_CIJFERS = new HashSet<>();
	private final long isbnNummer;
	static {
		MOGELIJKE_EERSTE_3_CIJFERS.add((short) 978);
		MOGELIJKE_EERSTE_3_CIJFERS.add((short) 979);
	}
	public Isbn(long isbnNummer) {
		if (isbnNummer < KLEINSTE_GETAL_MET_13_CIJFERS || isbnNummer > GROOTSTE_GETAL_MET_13_CIJFERS) {
			throw new IllegalArgumentException("Bevat geen 13 cijfers");
		}
		short eerste3Cijfers = (short) (isbnNummer / 10_000_000_000L);
		if (!MOGELIJKE_EERSTE_3_CIJFERS.contains(eerste3Cijfers)) {
			throw new IllegalArgumentException("Begint niet met " + MOGELIJKE_EERSTE_3_CIJFERS);
		}
		long somEvenCijfers = 0;
		long somOnevenCijfers = 0;
		long teVerwerkenCijfers = isbnNummer / 10;
		for (int teller = 0; teller != 6; teller++) {
			somEvenCijfers += teVerwerkenCijfers % 10;
			teVerwerkenCijfers /= 10;
			somOnevenCijfers += teVerwerkenCijfers % 10;
			teVerwerkenCijfers /= 10;
		}
		long controleGetal = somEvenCijfers * 3 + somOnevenCijfers;
		long naastGelegenHoger10Tal = controleGetal - controleGetal % 10 + 10;
		long verschil = naastGelegenHoger10Tal - controleGetal;
		long laatsteCijfer = isbnNummer % 10;
		if (verschil == 10) {
			if (laatsteCijfer != 0) {
				throw new IllegalArgumentException("Verkeerd controlegetal");
			}
		} else {
			if (laatsteCijfer != verschil) {
				throw new IllegalArgumentException("Verkeerd controlegetal");
			}
		}
		this.isbnNummer = isbnNummer;
	}
	@Override
	public String toString() {
		return String.valueOf(isbnNummer);
	}
}
