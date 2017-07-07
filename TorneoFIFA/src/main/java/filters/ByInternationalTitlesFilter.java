package filters;

import elementosfifa.FifaElement;
import elementosfifa.FifaTeam;

/**
 * @author andres.vaninetti
 *
 *         This filter select teams if have international titles.
 * 
 */
public class ByInternationalTitlesFilter implements Filter {

	private final static int ZERO = 0;

	public ByInternationalTitlesFilter() {
	}

	@Override
	public Boolean satisfy(FifaElement elemento) {
		return ((FifaTeam) elemento).getNumberOfInternationalTitles() > ZERO;
	}

}
