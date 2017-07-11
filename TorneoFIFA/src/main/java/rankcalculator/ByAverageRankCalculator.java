package rankcalculator;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Collectors;

import elementosfifa.FifaElement;
import elementosfifa.FifaTournament;

/**
 * @author andres.vaninetti
 *
 * This class generate a ranking of fifla elements.
 */
public class ByAverageRankCalculator implements RankCalculator {

	@Override
	public void generateRanking(FifaElement ef) {
		List<FifaElement> elfifa = ((FifaTournament) ef).getTournament();
		SortedMap<String, Float> ranking = new TreeMap<String, Float>();
		for (FifaElement elemento : elfifa) {
			float avg = elemento.getPoints() / getAvg(elemento);
			ranking.put(elemento.getName(), avg);
		}
		Map<String, Float> result = orderByAverage(ranking);
		printRanking(result);
	}

	private void printRanking(Map<String, Float> result) {
		for (Entry<String, Float> myent : result.entrySet()) {
			System.out.println(myent.getKey() + " " + myent.getValue());
		}
	}

	/**
	 * This method returns an ordered Map by value.
	 * 
	 * @param ranking
	 * @return Map : object
	 */
	private Map<String, Float> orderByAverage(SortedMap<String, Float> ranking) {
		Map<String, Float> result = ranking.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldvalue, newvalue) -> oldvalue, LinkedHashMap::new));
		return result;
	}

	private float getAvg(FifaElement elemento) {
		return ((FifaTournament) elemento).getNumberOfTeams();
	}

}
