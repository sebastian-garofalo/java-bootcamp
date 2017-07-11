package builderpattern;

public class FoodMain {

	public static void main(String[] args) {
		
		FoodBuilder fb = new ArgentinianFoodBuilder();
		FoodDirector foodDirector = new FoodDirector(fb);
		foodDirector.constructFood();
		Food food = foodDirector.getFood();
		System.out.println("Food is: " + food);
		

	}

}
