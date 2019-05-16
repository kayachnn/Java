package homework;

public class ParkRecord {
	private Time enterTime;
	private Time exitTime;
	private Vehicle vehicle;
	
	
	public ParkRecord(Time enterTime, Vehicle vehicle) {
		this.enterTime = enterTime;
		this.vehicle = vehicle;
	}
	
	
	public Time getEnterTime() {
		return enterTime;
	}


	public Time getExitTime() {
		return exitTime;
	}


	public Vehicle getVehicle() {
		return vehicle;
	}


	public int getParkingDuration() {
		
		return enterTime.getDifference(exitTime);  
	}
	
	public void setExitTime(Time exitTime) {
		this.exitTime = exitTime;
	}
	
}
