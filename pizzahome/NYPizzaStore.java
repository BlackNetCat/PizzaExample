package pizzahome;

public class NYPizzaStore extends PizzaStore {
	
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		if (item.equals("cheese")){
			pizza = new CheesePizza(ingredientFactory);
			pizza.setname("New York Style Cheese Pizza");		
		}else if (item.equals("veggie")){
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setname("New York Style Veggie Pizza");			
		}else if (item.equals("clam")){
			pizza = new ClamPizza(ingredientFactory);
			pizza.setname("New York Style Clam Pizza");
		}else if (item.equals("pepperoni")){
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setname("New York Style Pepperoni Pizza");		
		}else if (item.equals("custom")){
			pizza = new CustomPizza(ingredientFactory);
			pizza.setname("New York Style Custom Pizza");		
		}
		return pizza;
	}
}
