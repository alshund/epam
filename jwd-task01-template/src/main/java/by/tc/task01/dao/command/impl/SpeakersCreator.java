package by.tc.task01.dao.command.impl;

import by.tc.task01.dao.command.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;

public class SpeakersCreator implements Command {
    @Override
    public Appliance executed(Object[] objects) {
        Speakers speakers = new Speakers();
        return null;
    }
}
