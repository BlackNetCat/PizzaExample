package pizzahome;

public class CustomPizza extends Pizza {
	
	PizzaIngredientFactory ingredientFactory;
	
	String [] str = {"garlic", "onion", "mozzarella", "mozzarella"};
	
	
	public void setStr(String[] str) {
		this.str = str;
	}
	
	

	public CustomPizza (PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}



	@Override
	void prepare() {
		System.out.println("Preparing " + name);
		
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
	
		prepareCustom(str);
		
	}
	
	void prepareCustom(String[] str) {
		
		for (int i = 0; i < str.length; i++){
			custom = ingredientFactory.createCustom(str[i]);
		}
			
	

	}

}
