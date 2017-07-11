package builderpattern;

public class ArgentinianFoodBuilder implements FoodBuilder {

	private Food food;

	public ArgentinianFoodBuilder() {
		food = new Food();
	}

	@Override
	public void buildDrink() {
		this.food.setDrink("Wine");

	}

	@Override
	public void buildMainDish() {
		this.food.setMainDish("Roast beef");

	}

	@Override
	public void buildDessert() {
		this.food.setDessert("Fruit salad");

	}

	@Override
	public Food getFood() {
		return food;
	}

}
