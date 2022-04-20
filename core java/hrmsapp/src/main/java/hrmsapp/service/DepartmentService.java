package hrmsapp.service;

import java.util.List;

import hrmsapp.model.Department;

public interface DepartmentService {

	public void addDepartment(Department department);

	public List<Department> getAllDepartment();
}
