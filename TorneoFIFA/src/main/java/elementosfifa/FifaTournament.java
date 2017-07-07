package elementosfifa;

import java.util.List;
import java.util.Vector;

import filters.Filter;

/**
 * @author andres.vaninetti
 *
 *         This class represent a tournament and have a collection of Fifa
 *         elements.
 *
 */
public class FifaTournament extends FifaElement {

	private List<FifaElement> tournament;

	/**
	 * Default constructor method.
	 * 
	 */
	public FifaTournament() {

	}

	/**
	 * Constructor method with parameters.
	 * 
	 * @param nameTorneo
	 * @param fifaTournament
	 */
	public FifaTournament(String nameTorneo, List<FifaElement> fifaTournament) {
		this.nombre = nameTorneo;
		this.tournament = fifaTournament;
	}

	@Override
	public int getPoints() {
		int cantPts = 0;
		for (FifaElement element : tournament) {
			cantPts += element.getPoints();
		}
		return cantPts;
	}

	@Override
	public int getNumberOfPlayers() {
		int cantPlayers = 0;
		for (FifaElement element : tournament) {
			cantPlayers += element.getNumberOfPlayers();
		}
		return cantPlayers;
	}

	public List<FifaElement> getTournament() {
		return this.tournament;
	}

	public int getNumberOfTeams() {
		return this.tournament.size();
	}

	/**
	 * The method returns to a collection of fifa elements that meet a certain
	 * characteristic
	 * 
	 * @param Filter
	 */
	@Override
	public Vector<FifaElement> filterBy(Filter f) {
		Vector<FifaElement> elements = new Vector<FifaElement>();
		for (FifaElement ef : tournament) {
			elements.addAll(ef.filterBy(f));
		}
		return elements;
	}
}
