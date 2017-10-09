package by.tc.task01.dao.command.impl;

import by.tc.task01.dao.command.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;

import java.util.List;

public class OvenCreator implements Command {
    @Override
    public Appliance executed(List<Object> parameters) {
        Oven oven = new Oven();
        return null;
    }
}
