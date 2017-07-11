package adapterpattern;

public class CelciusReporter {

	protected double temperatureInCelcius;

	public CelciusReporter() {		
	}

	/**
	 * @return the temperatureInCelcius
	 */
	public double getTemperature() {
		return temperatureInCelcius;
	}

	/**
	 * @param temperatureInCelcius the temperatureInCelcius to set
	 */
	public void setTemperature(double temperatureInCelcius) {
		this.temperatureInCelcius = temperatureInCelcius;
	}
	
	

}
