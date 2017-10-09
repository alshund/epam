package by.tc.task01.dao.command.impl;

import by.tc.task01.dao.command.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.VacuumCleaner;

public class VacuumCleanerCreator implements Command {
    @Override
    public Appliance executed(Object[] objects) {
        VacuumCleaner vacuumCleaner = new VacuumCleaner();
        return null;
    }
}
