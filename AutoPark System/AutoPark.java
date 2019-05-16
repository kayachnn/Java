package homework;

import java.util.ArrayList;

public class AutoPark {
	private ArrayList<SubscribedVehicle> subscribedVehicles;
	private ArrayList<ParkRecord> parkRecords;
	private double hourlyFee, incomeDaily;
	private int capacity;
	
	
	public AutoPark(double hourlyFee, int capacity) {
		this.hourlyFee = hourlyFee;
		this.capacity= capacity;
		subscribedVehicles = new  ArrayList<SubscribedVehicle>();
		parkRecords = new ArrayList<ParkRecord>();
		capacity = this.capacity;
		incomeDaily=0;
		
	}
	
	public SubscribedVehicle searchVehicle(String Plate) {
		for(SubscribedVehicle vehicle:subscribedVehicles) {
			if(vehicle.getPlate() == Plate) {
				return vehicle;
			}
		}
		return null;
	}
	
	
	public boolean addVehicle(SubscribedVehicle aVehicle) {
		if(aVehicle.isSpecial() == true) {
			return false;
		}
		if(aVehicle.getSubscription() == null) {
			return false;
		}
		for(SubscribedVehicle vehicle:subscribedVehicles) {
			if(vehicle.getPlate() == aVehicle.getPlate()) {
				return false;
			}
		}
		
		subscribedVehicles.add(aVehicle);
		return true;
	}
	
	
	public boolean isParked(String Plate) {
		for(ParkRecord parkedCars:parkRecords) {
			if(parkedCars.getVehicle().getPlate() == Plate) {
				return true;
			}
		}
		return false;
	}
	
	public void showParked(String plate) {
		if(isParked(plate) == true){
			System.out.println(plate + " parked");
		}
		else {
			System.out.println(plate +" not parked");
		}
	}
	
	
	public boolean vehicleEnters(String plate, Time enter, boolean isOfficial) {
		if(isParked(plate) == true) {
			return false;
		}
		
		for(SubscribedVehicle vehicle:subscribedVehicles) {
			if(vehicle.getPlate() == plate) {
				ParkRecord vehicleRecord = new ParkRecord(enter, vehicle);
				parkRecords.add(vehicleRecord);
				return true;
			}
		}
		
		if(isOfficial == true) {
			OfficialVehicle officialVehicle = new OfficialVehicle(plate);
			ParkRecord vehicleRecord = new ParkRecord(enter, officialVehicle);
			parkRecords.add(vehicleRecord);
			return true;
		}
		
		RegularVehicle regularVehicle = new RegularVehicle(plate);
		ParkRecord vehicleRecord = new ParkRecord(enter, regularVehicle);
		parkRecords.add(vehicleRecord);
		
		
		return true;
	}
	
	public boolean VehicleExits(String plate, Time exit) {
		for(ParkRecord record:parkRecords) {
			if(record.getVehicle().getPlate() == plate) {
				if(record.getVehicle().isSpecial() == true) {
					this.incomeDaily += 0;
					parkRecords.remove(record);
					return true;
				}
				else if(record.getVehicle().getSubscription() == null) {
					record.setExitTime(exit);
					incomeDaily += hourlyFee*record.getParkingDuration();
					parkRecords.remove(record);
					return true;
				}
				else {
					incomeDaily += 0;
					parkRecords.remove(record);
					return true;
				}
				
			}
		}
		System.out.println("boyle bir araba otoparkta yok");
		return false;
	}
	
	public String toString() {
		String intro;
		intro = "Park Records: \n";
		for(ParkRecord record:parkRecords) {
			intro += "\nPlate: " + record.getVehicle().getPlate() + "\n";
			intro += "enterance hour:" + record.getEnterTime().getHour() + "\n"+
					"enterence minute:" +record.getEnterTime().getMinute();
			intro += "\n" + "---------------------------" + "\n";
		}
		
		intro += "\n\n";
		intro += "Subscribed Vehicles:\n\n";
		for(SubscribedVehicle vehicle:subscribedVehicles) {
			intro += "\nPlate: "+vehicle.getPlate() + "\n";
			intro += "subscription Begin:" + vehicle.getSubscription().getBegin().getDay() +"-"+
					vehicle.getSubscription().getBegin().getMonth()+"-"
					+ vehicle.getSubscription().getBegin().getYear() + "\n";
			intro+= "subscription End:" + vehicle.getSubscription().getEnd().getDay()+"-"+
					vehicle.getSubscription().getEnd().getMonth()+"-"+
					vehicle.getSubscription().getEnd().getYear() + "\n";
			intro += "--------------------------------" + "\n";
		}
		
		intro +="\n---------------------------------------------------------------"+"\n";
		
		return intro;
	}

	public double getIncomeDaily() {
		return incomeDaily;
	}
	
	
	
	
	
}
