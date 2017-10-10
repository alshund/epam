package by.tc.task01.dao.command.impl;

import by.tc.task01.dao.command.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;

import java.util.List;

public class OvenCreator implements Command {
    @Override
    public Appliance executed(List<String> parameters) {
        Oven oven = new Oven();
        setAllParameters(parameters, oven);
        return oven;
    }

    private void setAllParameters(List<String> parameters, Oven oven) {
        for (int parameterIndex = 0; parameterIndex < parameters.size(); parameterIndex++ ) {
            switch (parameterIndex){
                case 0:
                    oven.setPowerConsumption(Integer.parseInt(parameters.get(parameterIndex)));
                    break;
                case 1:
                    oven.setWeight(Integer.parseInt(parameters.get(parameterIndex)));
                    break;
                case 2:
                    oven.setCapacity(Integer.parseInt(parameters.get(parameterIndex)));
                    break;
                case 3:
                    oven.setDepth(Integer.parseInt(parameters.get(parameterIndex)));
                    break;
                case 4:
                    oven.setHeight(Double.parseDouble(parameters.get(parameterIndex)));
                    break;
                case 5:
                    oven.setWidth(Double.parseDouble(parameters.get(parameterIndex)));
                    break;
            }
        }
    }
}
