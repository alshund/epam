package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.validation.command.ValidationCommand;
import by.tc.task01.service.validation.command.ValidationDirector;

public class Validator {

	public static <E> boolean criteriaValidator(Criteria<E> criteria) {

		ValidationDirector director = new ValidationDirector();
		ValidationCommand command = director.getCommand(criteria.getApplianceTypeName());
		return command.executed(criteria, criteria.getKeyArray());
	}

}