package pizzahome;

public class CustomPizza extends Pizza {
	
	static String[] item = null;

	PizzaIngredientFactory ingredientFactory;
	
	String [] str = {"garlic", "onion", "mozzarella", "mozzarella"};
	
	
	

	public CustomPizza (PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
		
		
	}
	
	public CustomPizza (PizzaIngredientFactory ingredientFactory, String[] inputItem) {
		this.ingredientFactory = ingredientFactory;
		item = inputItem;
	}
	
	



	@Override
	void prepare() {
		
		System.out.println("Preparing " + name);
		
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		
		for (int i = 0; i < item.length; i++){
			custom = ingredientFactory.createCustom(item[i]);
		}
	
		
	}
	
	/*void prepare(String [] string) {
		
		System.out.println("Preparing " + name);
		
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		
		for (int i = 0; i < string.length; i++){
			custom = ingredientFactory.createCustom(string[i]);
		}
	
		
	}
	
	*/

	

}
