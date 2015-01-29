package pizzahome;

import java.util.ArrayList;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
	
	ArrayList<Custom> toppingCh = new ArrayList<Custom>();

	@Override
	public Dough createDough() {
		
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		
		return new Mozzarella();
	}

	@Override
	public Veggies[] createVeggies() {
		
		Veggies veggies[] = {new EggPlant(), new BlackOlives(), new Spinach()};
		
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}
	
	public Clams createClam() {
		
		return new FrozenClams();
	}

	

	@Override
	public ArrayList createCustom(String item) {
		switch(item) {
		case "garlic": 
			toppingCh.add(new Garlic());
				System.out.println("add Garlic");
				
		
		break;
		case "onion": 
			toppingCh.add(new Onion());
		  	 	System.out.println("add Onion");
	
		break;		
		case "spinach": 
			toppingCh.add(new Spinach());
		  	 	System.out.println("add Spinach");
	
		break;			
		case "cheese": 
			toppingCh.add(new Mozzarella());
		  	 	System.out.println("add Mozzarella");
	
		break;		
		case "pepperoni": 
			toppingCh.add(new SlicedPepperoni());
		  	 	System.out.println("add Sliced Pepperoni");
	
		break;	
		default: System.out.println("No such choice");
		}
		
		
		return toppingCh;
	}

	

}
