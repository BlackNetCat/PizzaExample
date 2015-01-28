package pizzahome;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

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
	public Custom createCustom() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
