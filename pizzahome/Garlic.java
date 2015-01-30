package pizzahome;

public class Garlic extends Custom  {
	
	String name = "Garlik";
	
	public void print() {
		System.out.println("Garlik");
	}

	@Override
	public String getName() {
		
		return name;
	}

}
