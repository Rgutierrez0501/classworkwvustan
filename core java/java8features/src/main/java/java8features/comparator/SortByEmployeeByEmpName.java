package java8features.comparator;

import java.util.Comparator;

public class SortByEmployeeByEmpName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmpName().compareTo(o2.getEmpName());
	}


}
