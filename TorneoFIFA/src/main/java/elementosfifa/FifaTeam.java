package elementosfifa;

import java.util.Vector;

import filters.Filter;

/**
 * @author andres.vaninetti
 *
 *         This class represent a team and have the mainly features of a team.
 */
public class FifaTeam extends FifaElement {

	private int points;
	private int numberOfInternationalTitles;
	private int numberOfNationalTitles;
	private int numberOfPlayers;
	private String actualCity;
	private String coach;

	/**
	 * Default constructor method.
	 * 
	 */
	public FifaTeam() {
	}

	/**
	 * Constructor method with parameters.
	 * 
	 * @param nombre
	 * @param points
	 * @param intTit
	 * @param natTit
	 * @param cantPlayers
	 * @param actualCity
	 * @param coach
	 */
	public FifaTeam(String nombre, int points, int intTit, int natTit, int cantPlayers, String actualCity, String coach) {
		this.nombre = nombre;
		this.points = points;
		this.numberOfInternationalTitles = intTit;
		this.numberOfNationalTitles = natTit;
		this.numberOfPlayers = cantPlayers;
		this.actualCity = actualCity;
		this.coach = coach;
	}

	public int getPoints() {
		return this.points;
	}

	public int getNumberOfInternationalTitles() {
		return numberOfInternationalTitles;
	}

	public int getNumberOfNationalTitles() {
		return this.numberOfNationalTitles;
	}

	public int getNumberOfPlayers() {
		return this.numberOfPlayers;
	}

	public String getActualCity() {
		return this.actualCity;
	}

	public String getCoach() {
		return this.coach;
	}

	/**
	 * If the elemento meet a condition, it's returned.
	 * 
	 */
	@Override
	public Vector<FifaElement> filterBy(Filter f) {
		Vector<FifaElement> elementList = new Vector<FifaElement>();
		if (f.satisfy(this)) {
			elementList.add(this);
		}
		return elementList;

	}

}
