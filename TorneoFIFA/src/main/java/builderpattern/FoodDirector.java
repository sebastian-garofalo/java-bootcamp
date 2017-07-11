package builderpattern;

public class FoodDirector {

	private FoodBuilder foodBuilder = null;

	public FoodDirector(FoodBuilder foodBuilder) {
		this.foodBuilder = foodBuilder;
	}

	public void constructFood() {
		this.foodBuilder.buildDessert();
		this.foodBuilder.buildDrink();
		this.foodBuilder.buildMainDish();
	}

	public Food getFood() {
		return this.foodBuilder.getFood();
	}
}
