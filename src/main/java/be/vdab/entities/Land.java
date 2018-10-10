package be.vdab.entities;

public class Land {
	private final String landcode;
	private final int oppervlakte;	// je maakt getters voor de private variabelen
	public Land(String landcode, int oppervlakte) {
		this.landcode = landcode;
		this.oppervlakte = oppervlakte;
	}
	public String getLandcode() {
		return landcode;
	}
	public int getOppervlakte() {
		return oppervlakte;
	}
}
