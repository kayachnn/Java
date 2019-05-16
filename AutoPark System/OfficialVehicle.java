package homework;

public class OfficialVehicle implements Vehicle {
	private String plate;
	private Subscription subscription;
	
	
	public OfficialVehicle(String plate) {
		this.plate = plate;
		Date begin,end;
		begin = new Date(0,0,0);
		end = new Date(0,0,Integer.MAX_VALUE);
		subscription = new Subscription(begin, end, plate);
	}
	
	public String getPlate() {
		
		return this.plate;
		
	}

	
	public Subscription getSubscription() {
		
		return this.subscription;
	}
	
	public boolean isSpecial() {
		
		return true;
	}

}
