package by.tc.task01.service.validation.command;

import by.tc.task01.entity.criteria.Criteria;

public interface ValidationCommand {
    public boolean executed(Criteria criteria, Object[] keyArray);
}
