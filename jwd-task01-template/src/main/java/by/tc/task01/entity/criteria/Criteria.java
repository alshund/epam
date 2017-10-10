package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;

public class Criteria<E> {
	private String applianceTypeName;

	private Map<E, Object> criteria = new HashMap<E, Object>();

	public void add(E searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}

	public Object getValue(E searchCriteria) {
		return criteria.get(searchCriteria);
	}

	public String getApplianceTypeName() {
		return applianceTypeName;
	}

	public void setApplianceTypeName(String applianceTypeName) {
		this.applianceTypeName = applianceTypeName;
	}

	public int getMapSize() {
		return criteria.size();
	}

	public Object[] getKeyArray() {
		return criteria.keySet().toArray();
	}
	// you may add your own code here

}
