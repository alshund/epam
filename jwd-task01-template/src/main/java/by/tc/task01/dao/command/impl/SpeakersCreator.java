package by.tc.task01.dao.command.impl;

import by.tc.task01.dao.command.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;

import java.util.List;

public class SpeakersCreator implements Command {

    @Override
    public Appliance executed(List<String> parameters) {

        Speakers speakers = new Speakers();
        setAllParameters(parameters, speakers);
        return speakers;
    }

    private void setAllParameters(List<String> parameters, Speakers speakers) {

        for (int parameterIndex = 0; parameterIndex < parameters.size(); parameterIndex++) {
            switch (parameterIndex) {
                case 0:

                    speakers.setPowerConsumption(Integer.parseInt(parameters.get(parameterIndex)));
                    break;
                case 1:

                    speakers.setNumberOfSpeakers(Integer.parseInt(parameters.get(parameterIndex)));
                    break;
                case 2:

                    speakers.setFrequencyRange(parameters.get(parameterIndex));
                    break;
                case 3:

                    speakers.setCordLength(Integer.parseInt(parameters.get(parameterIndex)));
                    break;
            }
        }
    }

}
