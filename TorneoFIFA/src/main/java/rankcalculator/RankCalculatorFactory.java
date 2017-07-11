package rankcalculator;

import fifa.RankingFifaMain.RankCalculatorType;

/**
 * Factory pattern
 * 
 * @author andres.vaninetti
 *
 */
public class RankCalculatorFactory {

	public static RankCalculator create(RankCalculatorType a) {
		switch (a) {
			case BY_AVERAGE:
				return new ByAverageRankCalculator();
			case BY_POINTS:
				return new ByPointsRankCalculator();
		}
		return null;
	}

}
