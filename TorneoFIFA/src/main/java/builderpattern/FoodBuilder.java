package builderpattern;

public interface FoodBuilder {

	public void buildDrink();

	public void buildMainDish();

	public void buildDessert();

	public Food getFood();

}
