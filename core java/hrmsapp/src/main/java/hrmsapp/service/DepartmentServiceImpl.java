package hrmsapp.service;

import java.util.List;

import hrmsapp.dao.DepartmentDAO;
import hrmsapp.dao.DepartmentDAOImpl;
import hrmsapp.model.Department;

public class DepartmentServiceImpl implements DepartmentService {

	public void addDepartment(Department department) {
		//Logic to call data layer addDepartment method to perform Create operation on DB
		DepartmentDAO departmentDAO=new DepartmentDAOImpl();
		departmentDAO.addDepartment(department);
	}

	public List<Department> getAllDepartment() {
		DepartmentDAO departmentDAO=new DepartmentDAOImpl();
		List<Department> listofdept = departmentDAO.getAllDepartment();
		return listofdept;
	}

	

}
