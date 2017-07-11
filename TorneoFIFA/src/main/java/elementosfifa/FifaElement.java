package elementosfifa;

import java.util.Vector;

import filters.Filter;

/**
 * @author andres.vaninetti
 *
 *         This class is used to abstract common behavior.
 *
 */
public abstract class FifaElement {

	protected String nombre;

	public abstract int getPoints();

	public abstract int getNumberOfPlayers();

	public abstract Vector<FifaElement> filterBy(Filter f);

	public String getName() {
		return this.nombre;
	}
}
