package by.tc.task01.service.validation.command.impl;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.Regular;
import by.tc.task01.service.validation.command.ValidationCommand;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RefrigeratorValidation implements ValidationCommand {

    @Override
    public boolean executed(Criteria criteria, Object[] keyArray) {
        for (Object key : keyArray) {
            if (!Regular.isNumber(String.valueOf(criteria.getValue(key)))) {
                return false;
            }
        }
        return true;
    }
}
