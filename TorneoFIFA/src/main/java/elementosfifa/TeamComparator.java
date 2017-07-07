package elementosfifa;

import java.util.Comparator;

public class TeamComparator implements Comparator<FifaElement> {

	public int compare(FifaElement e1, FifaElement e2) {
		if (e1.getPoints() < e2.getPoints()) {
			return -1;
		} else if (e1.getPoints() > e2.getPoints()) {
			return 1;
		} else
			return 0;
	}
}
