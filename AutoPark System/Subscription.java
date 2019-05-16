package homework;

public class Subscription {
	
	private String plate;
	private Date begin;
	private Date end;
	private SubscribedVehicle vehicle;
	
	
	public Subscription(Date begin, Date end, String plate) {
		this.begin = begin;
		this.end = end;
		this.vehicle = new SubscribedVehicle(plate, this);
	}
	
	public boolean isValid() {
		Date today = Date.getToday();
		if(today.isAfterThan(begin) && today.isBeforeThan(end)) {
			return true;
		}
		return false;
	}

	public Date getBegin() {
		return begin;
	}

	public Date getEnd() {
		return end;
	}
	
	public String getPlate() {
		return this.plate;
	}
}
