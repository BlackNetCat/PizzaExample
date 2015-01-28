package pizzahome;

import java.util.ArrayList;

public interface PizzaIngredientFactory {
	
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Clams createClam();
	public Pepperoni createPepperoni();
//	public Custom[] createCustom();
	public ArrayList<Custom> createCustom(String item);
	
	

}
