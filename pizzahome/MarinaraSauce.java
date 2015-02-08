package pizzahome;

public class MarinaraSauce implements Sauce {
	
	String name = "Marinara Sauce";

	@Override
	public void print() {
		System.out.println("Marinara Sauce");  //
		
	}

	@Override
	public String getName() {
		
		return name;
	}

}
