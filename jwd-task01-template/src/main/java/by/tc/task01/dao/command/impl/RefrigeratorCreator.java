package by.tc.task01.dao.command.impl;

import by.tc.task01.dao.command.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Refrigerator;

public class RefrigeratorCreator implements Command {
    @Override
    public Appliance executed(Object[] objects) {
        Refrigerator refrigerator = new Refrigerator();
        return null;
    }
}
