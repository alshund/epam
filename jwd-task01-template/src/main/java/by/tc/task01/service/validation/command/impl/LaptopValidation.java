package by.tc.task01.service.validation.command.impl;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.Regular;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.service.validation.command.ValidationCommand;

public class LaptopValidation implements ValidationCommand {

    @Override
    public boolean executed(Criteria criteria, Object[] keyArray) {

        for (Object key : keyArray) {
            if (SearchCriteria.Laptop.OS.equals(key)) {
                if (!(criteria.getValue(key) instanceof String) || criteria.getValue(key).toString().isEmpty()) {
                    return false;
                }
            }
            else {
                if (!Regular.isNumber(String.valueOf(criteria.getValue(key)))) {
                    return false;
                }
            }
        }
        return true;
    }
}
