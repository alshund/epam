package by.tc.task01.dao.command.impl;

import by.tc.task01.dao.command.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;

public class OvenCreator implements Command {
    @Override
    public Appliance executed(Object[] objects) {
        Oven oven = new Oven();
        return null;
    }
}
