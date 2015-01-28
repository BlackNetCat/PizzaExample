package pizzahome;

import java.util.ArrayList;

public class CustomPizza extends Pizza {
	
	PizzaIngredientFactory ingredientFactory;
	
	public CustomPizza (PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	ArrayList<Veggies> top = new ArrayList<Veggies>();
	
	@Override
	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		custom = ingredientFactory.createCustom("garlic");	
		
	}
	
	/*public void printToppings(){
			
		System.out.println("Ingredients : ");
		for (int i = 0; i < top.size(); i++){
			top.get(i).print();
		}
		
	}*/
	
	/*public ArrayList addToppings(String item) {		
	
		switch(item) {
		case "garlic": 
				top.add(new Garlic());
				System.out.println("add Garlic");
				
		
		break;
		case "onion": 
		  	 	top.add(new Onion());
		  	 	System.out.println("add Onion");
	
		break;		
		case "spinach": 
		  	 	top.add(new Spinach());
		  	 	System.out.println("add Spinach");
	
		break;		
		default: System.out.println("No such choice");
		}
		return top;

	}*/

}
