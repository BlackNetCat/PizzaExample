package pizzahome;

public abstract class PizzaStore {
	
	public Pizza orderPizza(String [] type) {
		Pizza pizza;
		pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}	
	
	public Pizza orderPizza(String type) {
		Pizza pizza;
		pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}	
	
	
	abstract Pizza createPizza(String [] type);
	abstract Pizza createPizza(String type);
	


}
