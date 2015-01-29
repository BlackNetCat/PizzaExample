package pizzahome;

import java.util.ArrayList;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
	
	ArrayList<Custom> toppingNY = new ArrayList<Custom>();

	@Override
	public Dough createDough() {
		
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		
		Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
		
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}
	
	public Clams createClam() {
		
		return new FreshClams();
	}

	@Override
	public ArrayList createCustom(String item){
		
		switch(item) {
		case "garlic": 
			toppingNY.add(new Garlic());
				System.out.println("add Garlic");
				
		
		break;
		case "onion": 
			toppingNY.add(new Onion());
		  	 	System.out.println("add Onion");
	
		break;		
		case "spinach": 
			toppingNY.add(new Spinach());
		  	 	System.out.println("add Spinach");
	
		break;			
		case "cheese": 
			toppingNY.add(new ReggianoCheese());
		  	 	System.out.println("add Reggiano Cheese");
	
		break;		
		case "pepperoni": 
			toppingNY.add(new SlicedPepperoni());
		  	 	System.out.println("add Sliced Pepperoni");
	
		break;	
		default: System.out.println("No such choice");
		}
		
		
		return toppingNY;
	}
	
	

}
