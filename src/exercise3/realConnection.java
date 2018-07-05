package exercise3;

/**
 * @author Fernanda M. Gonzalez
 */
public class realConnection implements connectionInterface {

	@Override
	public boolean isConnect() {
		return true;
	}

	@Override
	public String getQuery(String action) {
		String sentence = "Query for: " + action;
		return sentence;
	}

}
