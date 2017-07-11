package fifa;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import elementosfifa.FifaElement;
import elementosfifa.FifaTeam;
import elementosfifa.FifaTournament;
import filters.ByCityFilter;
import rankcalculator.RankCalculator;
import rankcalculator.RankCalculatorFactory;

/**
 * @author andres.vaninetti
 * 
 * This is my main class, used as an entry point.
 * 
 */
public class RankingFifaMain {

	public enum RankCalculatorType {
		BY_AVERAGE, BY_POINTS
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Equipos Argentina
		FifaElement boca = new FifaTeam("Boca", 10, 15, 36, 23, "La boca", "Barros Schellotto");
		FifaElement river = new FifaTeam("River", 9, 6, 40, 23, "Nuniez", "Marcelo Gallardo");
		FifaElement racing = new FifaTeam("Racing", 8, 3, 12, 23, "Avellaneda", "Diego Cocca");
		FifaElement independiente = new FifaTeam("Independiente", 7, 13, 20, 23, "Avellaneda", "Diego Holan");

		// Equipos Italia
		FifaElement inter = new FifaTeam("Inter", 20, 13, 25, 23, "Milan", "Mancini");
		FifaElement milan = new FifaTeam("Milan", 15, 36, 30, 23, "Milan", "Angelotti");
		FifaElement roma = new FifaTeam("Roma", 8, 3, 15, 14, "Roma", "Elcho");
		FifaElement juventus = new FifaTeam("Juventus", 22, 39, 10, 23, "Torino", "Allegri");

		// Premier League
		FifaElement united = new FifaTeam("United", 12, 8, 25, 23, "Manchester", "Pablo");
		FifaElement liverpool = new FifaTeam("Liverpool", 20, 36, 30, 23, "Liverpool", "Julian");
		FifaElement chelsea = new FifaTeam("Chelsea", 6, 3, 10, 23, "Londres", "Eze");
		FifaElement arsenal = new FifaTeam("Arsenal", 18, 5, 15, 23, "Londres", "Andrelo");

		// AFA
		List<FifaElement> equiposAfa = new ArrayList<FifaElement>();
		equiposAfa.add(river);
		equiposAfa.add(boca);
		equiposAfa.add(racing);
		equiposAfa.add(independiente);

		// Serie A
		List<FifaElement> equiposCalccio = new ArrayList<FifaElement>();
		equiposCalccio.add(juventus);
		equiposCalccio.add(inter);
		equiposCalccio.add(roma);
		equiposCalccio.add(milan);

		// Premier league
		List<FifaElement> equiposPremier = new ArrayList<FifaElement>();
		equiposPremier.add(united);
		equiposPremier.add(liverpool);
		equiposPremier.add(chelsea);
		equiposPremier.add(arsenal);

		FifaElement afa = new FifaTournament("afa", equiposAfa);
		FifaElement serieA = new FifaTournament("serieA", equiposCalccio);
		FifaElement premierLeague = new FifaTournament("premierLeague", equiposPremier);

		// RankCalculator rc =
		// RankCalculatorFactory.create(RankCalculatorType.BY_POINTS);
		// rc.generate(afa);
		// rc.generate(serieA);
		// rc.generate(premierLeague);

		List<FifaElement> fifa = new ArrayList<FifaElement>();
		fifa.add(serieA);
		fifa.add(afa);
		fifa.add(premierLeague);
		FifaElement intercontinental = new FifaTournament("intercontinental", fifa);
		RankCalculator rcr = RankCalculatorFactory.create(RankCalculatorType.BY_AVERAGE);
		rcr.generateRanking(intercontinental);

		Vector<FifaElement> equiposFiltrados = intercontinental.filterBy(new ByCityFilter("Milan"));
		for (FifaElement ef : equiposFiltrados) {
			System.out.println(ef.getName());
		}
	}

}
