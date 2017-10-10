package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.command.ApplianceDirector;
import by.tc.task01.dao.command.Command;
import by.tc.task01.entity.*;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.Regular;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApplianceDAOImpl implements ApplianceDAO{

    private final String FILE_PATH = "/appliances_db.txt";

    private URL resource;
    private BufferedReader bufferedReader;

    @Override
    public <E> Appliance find(Criteria<E> criteria) {

        resource = ApplianceDAOImpl.class.getResource(FILE_PATH);
        List<String> parameters = readFile(criteria);
        if (parameters != null) {
            ApplianceDirector director = new ApplianceDirector();
            Command command = director.getCommand(criteria.getApplianceTypeName());
            return command.executed(parameters);
        }
        else {
            return null;
        }
    }

    private List<String> readFile(Criteria criteria) {

        try {
            String line;
            Pattern genericSearchPattern = getPattern(Regular.GENERIC_SEARCH, criteria.getApplianceTypeName());
            bufferedReader = new BufferedReader(new FileReader(resource.getPath()));
            while( (line = bufferedReader.readLine()) != null) {
                Matcher genericMatcher = genericSearchPattern.matcher(line);
                if (genericMatcher.find()) {
                    int countOfSuitableCriteria = getCountOfSuitableCriteria(criteria, line);
                    if (isAllCriteriaSuitable(criteria, countOfSuitableCriteria)) {
                        return findAllCriteriaResult(line);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    private boolean isAllCriteriaSuitable(Criteria criteria, int countOfSuitableCriteria) {
        return countOfSuitableCriteria == criteria.getMapSize();
    }

    private int getCountOfSuitableCriteria(Criteria criteria, String line) {

        int countOfSuitableCriteria = 0;
        Object[] keyArray = criteria.getKeyArray();
        for (Object key : keyArray) {
            Pattern criteriaResultPattern = getPattern(Regular.CRITERIA_RESULT, key.toString());
            Matcher criteriaResultMatcher = criteriaResultPattern.matcher(line);
            if (criteriaResultMatcher.find()) {
                if (isSuitableCriteria(criteria, key, criteriaResultMatcher)) {
                    ++countOfSuitableCriteria;
                }
            }
        }
        return countOfSuitableCriteria;
    }

    private boolean isSuitableCriteria(Criteria criteria, Object key, Matcher criteriaResultMatcher) {
        return criteriaResultMatcher.group().equals(criteria.getValue(key).toString());
    }

    private List<String> findAllCriteriaResult(String line) {

        List<String> parameters = new ArrayList<>();
        Pattern allCriteriaResultPattern = getPattern(Regular.CRITERIA_RESULT, Regular.EMPTY_STRING);
        Matcher allCriteriaResultMatcher = allCriteriaResultPattern.matcher(line);
        while (allCriteriaResultMatcher.find()) {
            parameters.add(allCriteriaResultMatcher.group());
        }
        return parameters;
    }

    private Pattern getPattern(String regularExpression, String newVariable) {

        String modifiedRE = regularExpression.replace(Regular.VARIABLE, newVariable);
        return Pattern.compile(modifiedRE);
    }
}