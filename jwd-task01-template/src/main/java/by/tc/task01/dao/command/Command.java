package by.tc.task01.dao.command;

import by.tc.task01.entity.Appliance;

public interface Command {
    public Appliance executed(Object[] objects);
}
