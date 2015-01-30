package pizzahome;

public class Mushroom extends Custom {

	String name = "Mushroom";
	
	public void print() {
		
		System.out.println("Mushroom");
	}

	@Override
	public String getName() {
		
		return name;
	}

}
