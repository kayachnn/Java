package homework;

import java.util.Random;



public class Main {
	public static void main(String[] args) {
		
		Random rand = new Random(); 
		
		OfficialVehicle polisArabası1 = new OfficialVehicle("34 P 01");
		OfficialVehicle polisArabası2 = new OfficialVehicle("34 P 02");
		OfficialVehicle polisArabası3 = new OfficialVehicle("34 P 03");
		OfficialVehicle polisArabası4 = new OfficialVehicle("34 P 04");
		OfficialVehicle polisArabası5 = new OfficialVehicle("34 P 05");
		
		
		OfficialVehicle itfaiyeArabası1 = new OfficialVehicle("34 I 01");
		OfficialVehicle itfaiyeArabası2 = new OfficialVehicle("34 I 02");
		OfficialVehicle itfaiyeArabası3 = new OfficialVehicle("34 I 03");
		
		RegularVehicle bmv1 = new RegularVehicle("34 R 01");
		RegularVehicle bmv2 = new RegularVehicle("34 R 02");
		RegularVehicle bmv3 = new RegularVehicle("34 R 03");
		
		Date begin = new Date(rand.nextInt(30), rand.nextInt(12), rand.nextInt(5) + 2010);
		Date end   = new Date(rand.nextInt(30), rand.nextInt(12), rand.nextInt(5)+2015);
		Subscription audiSub1 = new Subscription(begin, end, "34 S 01");
		SubscribedVehicle audi1 = new SubscribedVehicle("34 S 01",audiSub1);
		
		
		Date begin2 = new Date(rand.nextInt(30), rand.nextInt(12), rand.nextInt(5) + 2010);
		Date end2   = new Date(rand.nextInt(30), rand.nextInt(12), rand.nextInt(5)+2015);
		Subscription audiSub2 = new Subscription(begin2, end2, "34 S 02");
		SubscribedVehicle audi2 = new SubscribedVehicle("34 S 02",audiSub2);
		
		Date begin3 = new Date(rand.nextInt(30), rand.nextInt(12), rand.nextInt(5) + 2010);
		Date end3   = new Date(rand.nextInt(30), rand.nextInt(12), rand.nextInt(5)+2015);
		Subscription audiSub3 = new Subscription(begin3, end3, "34 S 03");
		SubscribedVehicle audi3 = new SubscribedVehicle("34 S 03",audiSub3);
		
		Date begin4 = new Date(rand.nextInt(30), rand.nextInt(12), rand.nextInt(5) + 2010);
		Date end4   = new Date(rand.nextInt(30), rand.nextInt(12), rand.nextInt(5)+2015);
		Subscription audiSub4 = new Subscription(begin4, end4, "34 S 04");
		SubscribedVehicle audi4 = new SubscribedVehicle("34 S 04",audiSub4);
		
		
		AutoPark otopark = new AutoPark(5, 1000);
		System.out.println(otopark.toString());
		otopark.addVehicle(audi1);
		System.out.println(otopark.toString());
		otopark.addVehicle(audi2);
		System.out.println(otopark.toString());
		otopark.addVehicle(audi3);
		System.out.println(otopark.toString());
		otopark.addVehicle(audi4);
		System.out.println(otopark.toString());
		otopark.addVehicle(audi4);
		System.out.println(otopark.toString());
		otopark.vehicleEnters(audi1.getPlate(),new Time(4,10), false);
		System.out.println(otopark.toString());
		
		otopark.vehicleEnters(polisArabası5.getPlate(),new Time(3,5), true);
		
		otopark.vehicleEnters(polisArabası1.getPlate(), new Time(1,5), true);
		System.out.println(otopark.toString());
		
		otopark.vehicleEnters(itfaiyeArabası1.getPlate(), new Time(15,3), true);
		System.out.println(otopark.toString());
		
		otopark.vehicleEnters(itfaiyeArabası2.getPlate(), new Time(18,10), true);
		System.out.println(otopark.toString());
		
		otopark.vehicleEnters(bmv2.getPlate(),new Time(12,10), false);
		System.out.println(otopark.toString());
		
		otopark.vehicleEnters(bmv3.getPlate(), new Time(13,30), false);
		System.out.println(otopark.toString());
		
		
		otopark.showParked(bmv1.getPlate());
		
		otopark.showParked(bmv2.getPlate());
		otopark.showParked(audi1.getPlate());
		
		otopark.showParked(bmv3.getPlate());
		
		
		otopark.VehicleExits(polisArabası4.getPlate(), new Time(22,4));
		otopark.VehicleExits(polisArabası1.getPlate(), new Time(12,10));
		System.out.println("Daily income: "+otopark.getIncomeDaily());
		
		otopark.VehicleExits(audi1.getPlate(), new Time(6,10));
		System.out.println(otopark.toString());
		System.out.println("Daily income:" + otopark.getIncomeDaily());
		
		otopark.VehicleExits(bmv2.getPlate(), new Time(15,10));
		System.out.println(otopark.toString());
		System.out.println("Daily income : "+otopark.getIncomeDaily());
		
		otopark.VehicleExits(bmv3.getPlate(), new Time(17,45));
		System.out.println(otopark.toString());
		System.out.println("Daily income: " + otopark.getIncomeDaily());
		
	}

}
