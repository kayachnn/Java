package homework;

public class SubscribedVehicle implements Vehicle{
	
	private String plate;
	private Subscription subscription;
	
	
	
	public SubscribedVehicle(String plate, Subscription subscription) {
		this.plate = plate;
		this.subscription = subscription;
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
