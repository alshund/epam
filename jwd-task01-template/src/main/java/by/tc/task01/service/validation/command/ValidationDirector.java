package by.tc.task01.service.validation.command;


import by.tc.task01.service.validation.command.impl.*;

import java.util.HashMap;
import java.util.Map;

public class ValidationDirector {

    private Map<String, ValidationCommand> commands = new HashMap<>();

    public ValidationDirector() {

        commands.put("Oven", new OvenValidation());
        commands.put("Laptop", new LaptopValidation());
        commands.put("Speakers", new SpeakersValidation());
        commands.put("TabletPC", new TabletPCValidation());
        commands.put("Refrigerator", new RefrigeratorValidation());
        commands.put("VacuumCleaner", new VacuumCleanerValidation());
    }

    public ValidationCommand getCommand(String applianceTypeName) {

        ValidationCommand command;
        command = commands.get(applianceTypeName);
        return command;
    }
}
