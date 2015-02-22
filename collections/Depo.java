package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//enum TypeWagon {
//	PASSENGER,CARGO,TECHNICAL
//}

class Wagon {
	String name;
	String type;
	
	public void display() {
		// TODO Auto-generated method stub
		
	}

	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}	
	
}

class Train extends Wagon {
	
	String name;
	String type;
	
	
		
	public String getType() {
		return type;
	}

	public Train(String type) {
		this.type = type;
		name = "Train";
	}
	
	public void display (){
		System.out.println(name + " " + type);
	}
		
}

class Metro extends Wagon {
	
	String name;
	String type;
		
	public Metro(String type) {
		this.type = type;
		name = "Metro";
	}
	
	public String getType() {
		return type;
	}
	
	public void display (){
		System.out.println(name + " " + type);
	}
}


class Trolley extends Wagon {
	
	String name;
	String type;
		
	public Trolley(String type) {
		this.type = type;
		name = "Trolley";
	}
	
	public String getType() {
		return type;
	}
	
	public void display (){
		System.out.println(name + " " + type);
	}
}

public class Depo {
	
	static List<Wagon> wagons = new ArrayList<>();
	
	static List<Wagon> trains = new ArrayList<>();
	static List<Wagon> metros = new ArrayList<>();
	static List<Wagon> trolleys = new ArrayList<>();
	
	static List<Wagon> passenger = new ArrayList<>();
	static List<Wagon> cargo = new ArrayList<>();
	static List<Wagon> technical = new ArrayList<>();
	
	static void addRandomWagon(int quantity) {
		
		for (int i = 0; i < quantity; i++) {
			wagons.add(random((int) (Math.random()*7)));
			
		}
		
	}
	
	static Wagon random(int a) {
		Wagon w = null;
		switch (a) {
			case 1: w = new Train("Passenger");			
			break;
			case 2: w = new Train("Cargo");			
			break;
			case 3: w = new Metro("Passenger");			
			break;
			case 4: w = new Metro("Technical");			
			break;
			case 5: w = new Trolley("Passenger");			
			break;
			case 6: w = new Trolley("Technical");			
			break;
			default : w = new Train("Cargo");			
		}		
		return w;
	}
	
	public static void displayWagons() {
		System.out.println("All Transport :");
		for (Wagon m : wagons ){
			m.display();			
		}
	}
	
	public static void displayTrains() {
		System.out.println("Train Only :");
		for (Wagon m : trains ){
			m.display();		
			
		}
	}
	
	public static void displayMetros() {
		System.out.println("Metro only :");
		for (Wagon m : metros ){
			m.display();
			
		}
	}
	
	public static void displayTrolley() {
		System.out.println("Trolley Only : ");
		for (Wagon m : trolleys ){
			m.display();
			
		}
	}
	
	public static void displayPassenger() {
		System.out.println("Passanger's wagons Only :");
		for (Wagon m : passenger ){
			m.display();
		}
	}
	
	public static void displayCargo() {
		System.out.println("Cargo's wagons Only :");
		for (Wagon m : cargo ){
			m.display();
		}
	}
	
	public static void displayTechnical() {
		System.out.println("Technicals wagons Only :");
		for (Wagon m : technical ){
			m.display();
		}
	}
	
	public static void onlyTrain(){
		
		for (Wagon m : wagons ){
			if (m instanceof Train){
				trains.add(m);				
			}
		}		
	}
	
	public static void onlyMetro(){
		
		for (Wagon m : wagons ){
			if (m instanceof Metro){
				metros.add(m);				
			}
		}		
	}
	
	public static void onlyTrolley(){
		
		for (Wagon m : wagons ){
			if (m instanceof Trolley){
				trolleys.add(m);				
			}
		}		
	}
	
	public static void onlyPassenger(){
		for (Wagon m : wagons ){
			if (m.getType().contains("Passenger")){
				passenger.add(m);				
			}
		}				
	}
	
	public static void onlyCargo(){
		for (Wagon m : wagons ){
			if (m.getType().contains("Cargo")){
				cargo.add(m);				
			}
		}				
	}
	
	public static void onlyTechnical(){
		for (Wagon m : wagons ){
			if (m.getType().contains("Technical")){
				technical.add(m);				
			}
		}				
	}
	
	
	
	public static void main(String[] args) {
		
		
		addRandomWagon(20);
		displayWagons();
		
		onlyTrain();
		displayTrains();
		
		onlyMetro();
		displayMetros();
		
		onlyTrolley();
		displayTrolley();
		
		onlyPassenger();
		displayPassenger();
		
		onlyCargo();
		displayCargo();
		
		onlyTechnical();
		displayTechnical();
		
		
		
		
	}

}
