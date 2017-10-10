package by.tc.task01.dao.command.impl;

import by.tc.task01.dao.command.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.VacuumCleaner;

import java.util.List;

public class VacuumCleanerCreator implements Command {

    @Override
    public Appliance executed(List<String> parameters) {
        VacuumCleaner vacuumCleaner = new VacuumCleaner();
        setAllParameters(parameters, vacuumCleaner);
        return vacuumCleaner;
    }

    private void setAllParameters(List<String> parameters, VacuumCleaner vacuumCleaner) {

        for (int parameterIndex = 0; parameterIndex < parameters.size(); parameterIndex++) {
            switch (parameterIndex) {
                case 0:

                    vacuumCleaner.setPowerConsumption(Integer.parseInt(parameters.get(parameterIndex)));
                    break;
                case 1:

                    vacuumCleaner.setFilterType(parameters.get(parameterIndex));
                    break;
                case 2:

                    vacuumCleaner.setBagType(parameters.get(parameterIndex));
                    break;
                case 3:

                    vacuumCleaner.setWandType(parameters.get(parameterIndex));
                    break;
                case 4:

                    vacuumCleaner.setMotorSpeedRegulation(Integer.parseInt(parameters.get(parameterIndex)));
                    break;
                case 5:

                    vacuumCleaner.setCleaningWidth(Integer.parseInt(parameters.get(parameterIndex)));
                    break;
            }
        }
    }

}
