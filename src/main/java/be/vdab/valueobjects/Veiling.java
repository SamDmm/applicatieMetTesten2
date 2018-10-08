package be.vdab.valueobjects;

public class Veiling {
	int hoogsteBod = 0;
	public void doeBod(int bod) {
		if(bod > hoogsteBod) {
			hoogsteBod = bod;
		}
	}
	public int hoogsteBod() {
		return hoogsteBod;
	}
}
