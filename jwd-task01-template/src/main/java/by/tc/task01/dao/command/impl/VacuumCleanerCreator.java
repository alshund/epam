package by.tc.task01.dao.command.impl;

import by.tc.task01.dao.command.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.VacuumCleaner;

import java.util.List;

public class VacuumCleanerCreator implements Command {
    @Override
    public Appliance executed(List<Object> parameters) {
        VacuumCleaner vacuumCleaner = new VacuumCleaner();
        return null;
    }
}
