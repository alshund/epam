package by.tc.task01.dao.command.impl;

import by.tc.task01.dao.command.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;

import java.util.List;

public class LaptopCreator implements Command {

    @Override
    public Appliance executed(List<String> parameters) {

        Laptop laptop = new Laptop();
        setAllParameters(parameters, laptop);
        return laptop;
    }

    private void setAllParameters(List<String> parameters, Laptop laptop) {

        for (int parameterIndex = 0; parameterIndex < parameters.size(); parameterIndex++) {
            switch (parameterIndex) {
                case 0:

                    laptop.setBatteryCapacity(Double.parseDouble(parameters.get(parameterIndex)));
                    break;
                case 1:

                    laptop.setOs(parameters.get(parameterIndex));
                    break;
                case 2:

                    laptop.setMemoryRom(Integer.parseInt(parameters.get(parameterIndex)));
                    break;
                case 3:

                    laptop.setSystemMemory(Integer.parseInt(parameters.get(parameterIndex)));
                case 4:

                    laptop.setCpu(Double.parseDouble(parameters.get(parameterIndex)));
                    break;
                case 5:

                    laptop.setDisplayInches(Double.parseDouble(parameters.get(parameterIndex)));
                    break;
            }
        }
    }

}
