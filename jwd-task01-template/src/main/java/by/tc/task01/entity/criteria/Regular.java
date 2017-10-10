package by.tc.task01.entity.criteria;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Regular {

    public static final String VARIABLE = "variable";

    public static final String GENERIC_SEARCH = "^\\b" + VARIABLE + "(?=\\s)";

    public static final String CRITERIA_RESULT = "(?<=" + VARIABLE + "=)\\S*?(?=\\n|\\,|\\;)";

    public static final String EMPTY_STRING = "";

    public static final String NUMBER_VALIDATION = "^\\d+(\\.\\d+)?$";

    public static final String RANGE_VALIDATION = "^\\d+(\\.\\d+)?\\-\\d+(\\.\\d+)?$";

    public static boolean isNumber(String probableNumber) {

        Pattern validationPattern = Pattern.compile(NUMBER_VALIDATION);
        Matcher validationMatcher = validationPattern.matcher(probableNumber);
        return validationMatcher.find();
    }

    public static boolean isRange(String probableRange) {

        Pattern validationPattern = Pattern.compile(RANGE_VALIDATION);
        Matcher validationMatcher = validationPattern.matcher(probableRange);
        return validationMatcher.find();
    }

    private Regular() {}
}
