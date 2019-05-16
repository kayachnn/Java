package homework;

public class Time {
	private int minute,hour;
	
	
	public Time(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}
	
	public int getHour() {
		return this.hour;
	}
	
	public int getMinute() {
		return this.minute;
	}
	
	public int getDifference(Time other) {
		
		return ((other.getHour()*60 + other.getMinute()) - (this.getHour()*60 + this.getMinute())) / 60; 
		
		
	}
	
}
