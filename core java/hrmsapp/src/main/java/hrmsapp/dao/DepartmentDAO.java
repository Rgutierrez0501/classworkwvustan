package hrmsapp.dao;

import java.util.List;

import hrmsapp.model.Department;

public interface DepartmentDAO {

	public void addDepartment(Department department);

	public List<Department> getAllDepartment();
}
