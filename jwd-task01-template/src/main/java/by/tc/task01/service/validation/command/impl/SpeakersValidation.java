package by.tc.task01.service.validation.command.impl;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.Regular;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.service.validation.command.ValidationCommand;

public class SpeakersValidation implements ValidationCommand {

    @Override
    public boolean executed(Criteria criteria, Object[] keyArray) {
        for (Object key : keyArray) {
            if (SearchCriteria.Speakers.FREQUENCY_RANGE.equals(key)) {
                if (!Regular.isRange(String.valueOf(criteria.getValue(key)))) {
                    return false;
                }
            }
        }
        return true;
    }
}
