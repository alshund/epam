package by.tc.task01.dao.command.impl;

import by.tc.task01.dao.command.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;

import java.util.List;

public class TabletPCCreator implements Command {
    @Override
    public Appliance executed(List<String> parameters) {
        TabletPC tabletPC = new TabletPC();
        setAllParameters(parameters, tabletPC);
        return tabletPC;
    }

    private void setAllParameters(List<String> parameters, TabletPC tabletPC) {
        for (int parameterIndex = 0; parameterIndex < parameters.size(); parameterIndex++) {
            switch (parameterIndex) {
                case 0:
                    tabletPC.setPowerCapacity(Integer.parseInt(parameters.get(parameterIndex)));
                    break;
                case 1:
                    tabletPC.setDisplayInches(Integer.parseInt(parameters.get(parameterIndex)));
                    break;
                case 2:
                    tabletPC.setMemoryRom(Integer.parseInt(parameters.get(parameterIndex)));
                    break;
                case 3:
                    tabletPC.setFlashMemoryCapacity(Integer.parseInt(parameters.get(parameterIndex)));
                    break;
                case 4:
                    tabletPC.setColor(parameters.get(parameterIndex));
                    break;
            }
        }
    }
}
