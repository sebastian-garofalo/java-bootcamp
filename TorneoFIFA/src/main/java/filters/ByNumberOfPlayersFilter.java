package filters;

import elementosfifa.FifaElement;

/**
 * @author andres.vaninetti
 * 
 *         Filter teams by minumum number of players.
 *
 */
public class ByNumberOfPlayersFilter implements Filter {

	private int minimumNumberOfPlayers;

	public ByNumberOfPlayersFilter(int cantPlayers) {
		this.minimumNumberOfPlayers = cantPlayers;
	}

	@Override
	public Boolean satisfy(FifaElement elemento) {
		return elemento.getNumberOfPlayers() > this.minimumNumberOfPlayers;
	}

}
