package by.tc.task01.dao.command.impl;

import by.tc.task01.dao.command.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Refrigerator;

import java.util.List;

public class RefrigeratorCreator implements Command {
    @Override
    public Appliance executed(List<Object> parameters) {
        Refrigerator refrigerator = new Refrigerator();
        return null;
    }
}
