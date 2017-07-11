package filters;

import elementosfifa.FifaElement;
import elementosfifa.FifaTeam;

/**
 * @author andres.vaninetti
 * 
 *         Filter teams by city.
 *
 */
public class ByCityFilter implements Filter {

	private String city;

	public ByCityFilter(String city) {
		this.city = city;
	}

	@Override
	public Boolean satisfy(FifaElement elemento) {
		return ((FifaTeam) elemento).getActualCity().equals(this.city);
	}

}
