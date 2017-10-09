package by.tc.task01.dao.command.impl;

import by.tc.task01.dao.command.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;

import java.util.List;

public class SpeakersCreator implements Command {
    @Override
    public Appliance executed(List<Object> parameters) {
        Speakers speakers = new Speakers();
        return null;
    }
}
