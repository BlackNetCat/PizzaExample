package pizzahome;

import java.util.ArrayList;

public abstract class Pizza {
	
	String name;
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Clams clam;
	Pepperoni pepperoni;
	ArrayList<Custom> custom;
	
	
	abstract void prepare(); 
	 
	
	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	
	void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
	
	void setname(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	

}
