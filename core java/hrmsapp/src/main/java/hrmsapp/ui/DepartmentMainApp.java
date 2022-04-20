package hrmsapp.ui;

import java.util.List;
import java.util.Scanner;

import hrmsapp.model.Department;
import hrmsapp.service.DepartmentService;
import hrmsapp.service.DepartmentServiceImpl;

public class DepartmentMainApp {

	public static void main(String[] args) {
		Department deptObj = new Department();
		deptObj.setDeptId(1);
		deptObj.setDeptName("Finance");
		Department depObj = new Department(2,"Marketing");
		
		Department dept = new Department();
		Scanner scannerObj = new Scanner(System.in);
		System.out.println("Enter deptId - \n");
		dept.setDeptId(scannerObj.nextInt());
		System.out.println("Enter deptName - \n");
		dept.setDeptName(scannerObj.next());
		
		System.out.println(dept);
		
		DepartmentService deptService = new DepartmentServiceImpl();
		deptService.addDepartment(deptObj);
		deptService.addDepartment(depObj);
		deptService.addDepartment(dept);
		List<Department> listOfDept = deptService.getAllDepartment();
		System.out.println(listOfDept);

	}

}
