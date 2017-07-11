package rankcalculator;

import java.util.Collections;
import java.util.List;

import elementosfifa.FifaElement;
import elementosfifa.TeamComparator;
import elementosfifa.FifaTournament;

public class ByPointsRankCalculator implements RankCalculator {
	
	@Override
	public void generateRanking (FifaElement ef) {
		List<FifaElement> torneo = ((FifaTournament)ef).getTournament();
		Collections.sort(torneo, new TeamComparator());
		Collections.reverse(torneo);
		for (FifaElement e:torneo){
			System.out.println(e.getName() + " "+ e.getPoints());
		}
		
	}
}
