package by.tc.task01.dao.command.impl;

import by.tc.task01.dao.command.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;

import java.util.List;

public class TabletPCCreator implements Command {
    @Override
    public Appliance executed(List<Object> parameters) {
        TabletPC tabletPC = new TabletPC();
        return null;
    }
}
