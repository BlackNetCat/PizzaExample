package homebuses;

public class Bus{
	
	private int numberBus;
	private String driverIni;
	private int numberRoute;
	
	
	
	public Bus(int numberBus, String driverIni, int numberRoute) {
		this.numberBus = numberBus;
		this.driverIni = driverIni;
		this.numberRoute = numberRoute;
	}



	public int getNumberBus() {
		return numberBus;
	}



	public void setNumberBus(int numberBus) {
		this.numberBus = numberBus;
	}



	public String getDriverIni() {
		return driverIni;
	}



	public void setDriverIni(String driverIni) {
		this.driverIni = driverIni;
	}



	public int getNumberRoute() {
		return numberRoute;
	}



	public void setNumberRoute(int numberRoute) {
		this.numberRoute = numberRoute;
	}



	public void display(){
		System.out.println("Bus number : " + getNumberBus() + " , " + "Driver is : " + getDriverIni() + " ," + " Route number is : " + getNumberRoute());
	}
}