package by.tc.task01.dao.command.impl;

import by.tc.task01.dao.command.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Refrigerator;

import java.util.List;

public class RefrigeratorCreator implements Command {
    @Override
    public Appliance executed(List<String> parameters) {
        Refrigerator refrigerator = new Refrigerator();
        setAllParameters(parameters, refrigerator);
        return refrigerator;
    }

    private void setAllParameters(List<String> parameters, Refrigerator refrigerator) {
        for (int parameterIndex = 0; parameterIndex < parameters.size(); parameterIndex++ ) {
            switch (parameterIndex){
                case 0:
                    refrigerator.setPowerConsumption(Integer.parseInt(parameters.get(parameterIndex)));
                    break;
                case 1:
                    refrigerator.setWeight(Integer.parseInt(parameters.get(parameterIndex)));
                    break;
                case 2:
                    refrigerator.setFreezerCapacity(Integer.parseInt(parameters.get(parameterIndex)));
                    break;
                case 3:
                    refrigerator.setOverallCapacity(Double.parseDouble(parameters.get(parameterIndex)));
                    break;
                case 4:
                    refrigerator.setHeight(Integer.parseInt(parameters.get(parameterIndex)));
                    break;
                case 5:
                    refrigerator.setWidth(Integer.parseInt(parameters.get(parameterIndex)));
                    break;
            }
        }
    }
}
