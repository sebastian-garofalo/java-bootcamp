package filters;

import elementosfifa.FifaElement;

/**
 * @author andres.vaninetti
 *
 *         Class used to filter teams by AND condition.
 * 
 */
public class ByAndFilter extends ComposedFilter {

	private Filter filterB;

	public ByAndFilter(Filter filtroA, Filter filtroB) {
		super(filtroA);
		this.filterB = filtroB;
	}

	@Override
	public Boolean satisfy(FifaElement elemento) {
		return filtroA.satisfy(elemento) && filterB.satisfy(elemento);
	}

}
