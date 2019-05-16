package homework;

public class RegularVehicle implements Vehicle{
	private String plate;
	private Subscription subscription = null;
	
	
	
	public RegularVehicle(String plate) {
		this.plate = plate;
	}
	
	
	
	
	public String getPlate() {
		
		return this.plate;
	}

	
	public Subscription getSubscription() {
		
		return this.subscription;
	}

	
	public boolean isSpecial() {
		
		return false;
	}

}
