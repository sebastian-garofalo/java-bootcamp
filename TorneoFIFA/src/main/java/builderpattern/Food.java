package builderpattern;

public class Food {

	private String drink;
	private String mainDish;
	private String dessert;

	public String getDrink() {
		return drink;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}

	/**
	 * @return the mainDish
	 */
	public String getMainDish() {
		return mainDish;
	}

	/**
	 * @param mainDish,
	 *            the mainDish to set
	 */
	public void setMainDish(String mainDish) {
		this.mainDish = mainDish;
	}

	/**
	 * @return the dessert
	 */
	public String getDessert() {
		return dessert;
	}

	/**
	 * @param dessert,
	 *            the dessert to set
	 */
	public void setDessert(String dessert) {
		this.dessert = dessert;
	}

	public String toString() {
		return "drink:" + this.drink + ", main dish:" + this.mainDish + ", dessert:" + this.dessert;
	}
}
