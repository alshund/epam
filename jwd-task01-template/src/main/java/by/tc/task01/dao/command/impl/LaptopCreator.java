package by.tc.task01.dao.command.impl;

import by.tc.task01.dao.command.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;

public class LaptopCreator implements Command {
    @Override
    public Appliance executed(Object[] objects) {
        Laptop laptop = new Laptop();
        return null;
    }
}
