package homework;
import java.util.*;


public class Date {
	
	private int day,month,year;
	
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
		
	}
	
	public boolean isAfterThan(Date other) {
		
		if(other.getYear() > this.year) {
			return true;
		}
		else if(other.getYear() < this.year) {
			return false;
		}
		else {
			if(other.getMonth()>this.month) {
				return true;
			}
			else if(other.getMonth()<this.month) {
				return false;
			}
			else{
				if(other.getDay() > this.day) {
					return false;			
				}
				else if(other.getDay()<this.day) {
					return false;
				}
				else {
					return false;
				}
			}
		}
		
	}
	
	
	public boolean isEqualsWith(Date other) {
		if(this.getYear() == other.year && this.getMonth() == other.getMonth() && this.getDay() == other.getDay()) {
			return true;
		}
		return false;
	}
	
    public boolean isBeforeThan(Date other) {
		if(isEqualsWith(other) == false && isAfterThan(other) == false) {
			return true;
		}
		return false;
	}
	
	
	public static Date getToday() {
		Calendar cldr = Calendar.getInstance();
		Date today = new Date(cldr.get(Calendar.DATE), cldr.get(Calendar.MONTH), cldr.get(Calendar.YEAR));
		return today;
	}
	
	
	
	public int getYear() {
		return this.year;
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public int getDay() {
		return this.day;
	}
	
}
