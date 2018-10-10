package repositories;

import be.vdab.entities.Land;

public interface LandRepository {
	Land read(String landcode);
	int findOppervlakteAlleLanden();
}
