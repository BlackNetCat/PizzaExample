package homebuses;

import java.util.LinkedList;
import java.util.List;

public class BusPark {
	
	static List<Bus> parkList = new LinkedList<Bus>();	
	static List<Bus> routeList = new LinkedList<Bus>();	
	
	
	public static void displayBus() {
		
		System.out.println("In Park :");
		for (int i = 0; i < parkList.size(); i++){
			parkList.get(i).display();
		}
		System.out.println("On the route :");
		for (int i = 0; i < routeList.size(); i++){
			routeList.get(i).display();
		}
		System.out.println("*********************");
	}
	
	public static void radeBus (Bus b) {
		parkList.remove(b);
		routeList.add(b);
		System.out.println("Bus # " + b.getNumberBus() + " Go to route " + b.getNumberRoute() );
	}
	
	public static void returnBus(Bus b) {
		routeList.remove(b);
		parkList.add(b);
		System.out.println("Bus # " + b.getNumberBus() + " Return to Park ");
	}
	
	public static void main(String[] args) {
		
				
		Bus bus1 = new Bus(4621,"Sarkisyan R.T",93);	
		Bus bus2 = new Bus(4622,"Martirasyan A.T",72);		
		Bus bus3 = new Bus(4623,"Petrosyan E.T",73);		
		
		parkList.add(bus1);
		parkList.add(bus2);
		parkList.add(bus3);
		
		displayBus();		
		
		radeBus(bus3);
		
		displayBus();	
		
		returnBus(bus3);
		
		displayBus();	
		
	}

}
