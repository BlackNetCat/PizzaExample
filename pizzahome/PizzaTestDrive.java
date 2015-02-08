package pizzahome;

import java.awt.EventQueue;



public class PizzaTestDrive {	
	
	static void orderRegularNY(String string){
		
		PizzaStore nyStore = new NYPizzaStore();			
		Pizza pizza = nyStore.orderPizza(string);			
		System.out.println("Ingredints : " + pizza.getName() + " :");		
		if (pizza.pepperoni != null) {			
			pizza.pepperoni.print();			
		}
		if (pizza.cheese != null) {			
			pizza.cheese.print();			
		}
		if (pizza.clam != null) {			
			pizza.clam.print();			
		}
		if (pizza.veggies != null) {
			for (int i = 0; i < pizza.veggies.length; i++){
				pizza.veggies[i].print();
			}
		}
		
		pizza.dough.print();
		pizza.sauce.print();		
		System.out.println("Client ordered a " + pizza.getName() + "\n");
		
	}
	
	static void orderRegularChicago(String string){
		
		PizzaStore chStore = new ChicagoPizzaStore();			
		Pizza pizza = chStore.orderPizza(string);			
		System.out.println("Ingredints : " + pizza.getName() + " :");		
		if (pizza.pepperoni != null) {			
			pizza.pepperoni.print();			
		}
		if (pizza.cheese != null) {			
			pizza.cheese.print();			
		}
		if (pizza.clam != null) {			
			pizza.clam.print();			
		}
		if (pizza.veggies != null) {
			for (int i = 0; i < pizza.veggies.length; i++){
				pizza.veggies[i].print();
			}
		}
		
		pizza.dough.print();
		pizza.sauce.print();		
		System.out.println("Client ordered a " + pizza.getName() + "\n");
		
	}
	
	static void orderCustomNY(String [] top){
		
		PizzaStore nyStore = new NYPizzaStore();			
		//Pizza pizza = nyStore.orderPizza("custom");		
		Pizza pizza = nyStore.orderPizza(top);		
		System.out.println("Ingredints : " + pizza.getName() + " :");
				
		if (pizza.custom != null) {
			for (int i = 0; i < pizza.custom.size(); i++){
				pizza.custom.get(i).print();
			}
		}
		pizza.dough.print();
		pizza.sauce.print();
				
		System.out.println("Client ordered a " + pizza.getName() + "\n");
		
	}
	
	static void orderCustomChicago(String [] top){
		
		PizzaStore chStore = new ChicagoPizzaStore();			
		//Pizza pizza = nyStore.orderPizza("custom");		
		Pizza pizza = chStore.orderPizza(top);		
		System.out.println("Ingredints : " + pizza.getName() + " :");
				
		if (pizza.custom != null) {
			for (int i = 0; i < pizza.custom.size(); i++){
				pizza.custom.get(i).print();
			}
		}
		pizza.dough.print();
		pizza.sauce.print();
				
		System.out.println("Client ordered a " + pizza.getName() + "\n");
		
	}
	
	public static void main(String[] args) {
		
		String [] toppingsForCustomPizza = {"cheese", "cheese", "garlic", "pepperoni"};
				
	//	orderRegularNY("veggie");	
	//	orderRegularChicago("clam");
		
		orderCustomNY(toppingsForCustomPizza);	
		orderCustomChicago(toppingsForCustomPizza);
			
	
		EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				View window = new View();
				
				window.frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		});
	
			
	}
	
	
		
	

}
