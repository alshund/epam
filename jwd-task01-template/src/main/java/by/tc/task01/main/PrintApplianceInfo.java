package by.tc.task01.main;

import by.tc.task01.entity.Appliance;

public class PrintApplianceInfo {
	
	public static void print(Appliance appliance) {
		if (appliance != null) {
			System.out.println(appliance.getAllParameters());
		}
		else {
			System.out.println("Not enough");
		}

	}
	
	// you may add your own code here

}
