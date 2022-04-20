package hrmsapp.dao;

import java.util.ArrayList;
import java.util.List;

import hrmsapp.model.Department;

public class DepartmentDAOImpl implements DepartmentDAO {

	public static List<Department> listOfDepartment = new ArrayList<Department>();
	public void addDepartment(Department department) {
		//Logic to persist or save department object in a DB
		listOfDepartment.add(department);
	}
	public List<Department> getAllDepartment() {
		return listOfDepartment;
	}

}
