package adapterpattern;


public class TemperatureClassReporter extends CelciusReporter implements TemperatureInfo {

	@Override
	public double getTemperatureInF() {
		return cToF(temperatureInCelcius);
	}

	@Override
	public void setTemperatureInF(double tempInF) {
		setTemperatureInF(tempInF);		
	}

	@Override
	public double getTemperatureInC() {
		return temperatureInCelcius;
	}

	@Override
	public void setTemperatureInC(double tempInC) {
		setTemperatureInC(tempInC);		
	}
	
	private double fToC(double f) {
		return ((f - 32) * 5 / 9);
	}

	private double cToF(double c) {
		return ((c * 9 / 5) + 32);
	}


}
