package pizzahome;

public class ChicagoPizzaStore extends PizzaStore {	
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
		if (item.equals("cheese")){
			pizza = new CheesePizza(ingredientFactory);
			pizza.setname("Chicago Style Cheese Pizza");		
			
		}else if (item.equals("veggie")){
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setname("Chicago Style Veggie Pizza");
		}else if (item.equals("clam")){
			pizza = new ClamPizza(ingredientFactory);
			pizza.setname("Chicago Style Clam Pizza");
		}else if (item.equals("pepperoni")){
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setname("Chicago Style Pepperoni Pizza");
		}else if (item.equals("custom")){
			pizza = new CustomPizza(ingredientFactory);
			pizza.setname("Chicago Style Custom Pizza");
		
	}
		return pizza;
	}
	

}



