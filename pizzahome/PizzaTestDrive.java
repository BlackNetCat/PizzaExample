package pizzahome;



public class PizzaTestDrive {	
	
	public static void main(String[] args) {
				
		
		PizzaStore nyStore = new NYPizzaStore();						
		Pizza pizza = nyStore.orderPizza("custom");			
		
		System.out.println("Ingredints : " + pizza.getName() + " :");
		pizza.dough.print();
		pizza.sauce.print();
		
		if (pizza.pepperoni != null) {			
			pizza.pepperoni.print();			
		}
		if (pizza.cheese != null) {			
			pizza.cheese.print();			
		}
		if (pizza.veggies != null) {
			for (int i = 0; i < pizza.veggies.length; i++){
				pizza.veggies[i].print();
			}
		}
		if (pizza.custom != null) {
			for (int i = 0; i < pizza.custom.size(); i++){
				pizza.custom.get(i).print();
			}
		}
		
		System.out.println("****************************");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
	
		
		
		/*pizza = chicagoStore.orderPizza("custom");
		
		System.out.println("Joel ordered a " + pizza.getName() + "\n");*/		
		
		
	}

}
