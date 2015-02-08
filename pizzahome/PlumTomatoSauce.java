package pizzahome;

public class PlumTomatoSauce implements Sauce {
	
	String name = "Plum Tomato Sauce";

	@Override
	public void print() {
		System.out.println("Plum Tomato Sauce");  //
		
	}

	@Override
	public String getName() {
		
		return name;
	}

}
