package by.tc.task01.dao.command;

import by.tc.task01.dao.command.impl.*;

import java.util.HashMap;
import java.util.Map;

public class ApplianceDirector {
    private Map<String, Command> commands = new HashMap<>();

    public ApplianceDirector() {
        commands.put("Oven", new OvenCreator());
        commands.put("Laptop", new LaptopCreator());
        commands.put("Speakers", new SpeakersCreator());
        commands.put("TabletPC", new TabletPCCreator());
        commands.put("Refrigerator", new RefrigeratorCreator());
        commands.put("VacuumCleaner", new VacuumCleanerCreator());
    }

    public Command getCommand(String applianceTypeName) {
        Command command;
        command = commands.get(applianceTypeName);
        return command;
    }
}
