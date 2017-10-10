package by.tc.task01.dao.command;

import by.tc.task01.entity.Appliance;

import java.util.List;

public interface Command {

    Appliance executed(List<String> parameters);

}
