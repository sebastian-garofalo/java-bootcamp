package rankcalculator;

import elementosfifa.FifaElement;

/**
 * @author andres.vaninetti
 * 
 *         Strategy pattern. Define a contract for generate rankings by
 *         diferents type of metrics.
 * 
 */
public interface RankCalculator {

	public void generateRanking(FifaElement ef);

}
