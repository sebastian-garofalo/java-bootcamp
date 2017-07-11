package builderpattern;

public class ItalianFoodBuilder implements FoodBuilder {

	private Food food;

	public ItalianFoodBuilder() {
		food = new Food();
	}

	@Override
	public void buildDrink() {
		this.food.setDrink("fernet");
	}

	@Override
	public void buildMainDish() {
		this.food.setMainDish("spaghettis");
	}

	@Override
	public void buildDessert() {
		this.food.setDessert("gelatto");
	}

	@Override
	public Food getFood() {
		return food;
	}

}
