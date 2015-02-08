package pizzahome;

public class Mozzarella extends Custom {
	
	String name = "Mozzarella";

	@Override
	public void print() {
		System.out.println("Mozzarella");
		
	}

	@Override
	public String getName() {
		
		return name;
	}

}
