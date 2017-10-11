package by.tc.task01.main;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

public class Main {

	public static void main(String[] args) {
		Appliance appliance;
		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria<Oven> criteriaOven = new Criteria<Oven>();
		criteriaOven.setApplianceTypeName("Oven");
		criteriaOven.add(Oven.CAPACITY, 32);
		criteriaOven.add(Oven.DEPTH, 60);
		criteriaOven.add(Oven.POWER_CONSUMPTION, "1000");
		criteriaOven.add(Oven.WIDTH, 59.5);
		criteriaOven.add(Oven.WEIGHT, 10);
		criteriaOven.add(Oven.HEIGHT, 45.5);

		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria<Oven>();
		criteriaOven.setApplianceTypeName("Oven");
		criteriaOven.add(Oven.HEIGHT, 200);
		criteriaOven.add(Oven.DEPTH, 300);

		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

		Criteria<TabletPC> criteriaTabletPC = new Criteria<TabletPC>();
		criteriaTabletPC.setApplianceTypeName("TabletPC");
		criteriaTabletPC.add(TabletPC.COLOR, "blue");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES, "asd");

		appliance = service.find(criteriaTabletPC);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

		Criteria<Laptop> criteriaLaptop = new Criteria<>();
		criteriaLaptop.setApplianceTypeName("Laptop");
		criteriaLaptop.add(Laptop.OS, "Linux");

		appliance = service.find(criteriaLaptop);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

		Criteria<Refrigerator> refrigeratorCriteria = new Criteria<>();
		refrigeratorCriteria.setApplianceTypeName("Refrigerator");
		refrigeratorCriteria.add(Refrigerator.OVERALL_CAPACITY, 300);

		appliance = service.find(refrigeratorCriteria);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

		Criteria<Speakers> speakersCriteria = new Criteria<>();
		speakersCriteria.setApplianceTypeName("Speakers");
		speakersCriteria.add(Speakers.FREQUENCY_RANGE, "2-3.5");

		appliance = service.find(speakersCriteria);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

		Criteria<VacuumCleaner> vacuumCleanerCriteria = new Criteria<>();
		vacuumCleanerCriteria.setApplianceTypeName("VacuumCleaner");
		vacuumCleanerCriteria.add(VacuumCleaner.FILTER_TYPE, "C");
		vacuumCleanerCriteria.add(VacuumCleaner.BAG_TYPE, "AA-89");

		appliance = service.find(vacuumCleanerCriteria);

		PrintApplianceInfo.print(appliance);

	}

}
