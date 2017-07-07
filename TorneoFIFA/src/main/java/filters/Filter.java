package filters;

import elementosfifa.FifaElement;

/**
 * This interface is defined to search teams with a determine feature.
 * 
 * @author andres.vaninetti
 *
 */
public interface Filter {

	public Boolean satisfy(FifaElement elemento);

}
