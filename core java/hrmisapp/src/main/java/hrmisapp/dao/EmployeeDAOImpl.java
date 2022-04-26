package hrmisapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import hrmisapp.data.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	public List<Employee> getEmployeeWithJobTitle(String jobTitle) {
		//JDBC - Java Database Connection API
		try (Connection connection =  DriverManager.getConnection(
                "jdbc:postgresql://127.0.0.1:5432/test", "postgres", "password");
				PreparedStatement preparedStatement = connection.prepareStatement(QueryMapper.GET_EMPLOYEE_BY_JOB_TITLE);){
			preparedStatement.setString(1, jobTitle);
			ResultSet resultSet = preparedStatement.executeQuery();
			Employee employee;
			List<Employee> employeesList = new ArrayList<>();
			while (resultSet.next()) {
				employee = new Employee();
				populateEmployee(employee, resultSet);
				employeesList.add(employee);
			}	
			
			return employeesList;

		} catch (SQLException e) {
			
			e.printStackTrace();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return null;
	}

	private void populateEmployee(Employee employee, ResultSet resultSet) throws SQLException {
		employee.setEmpId(resultSet.getInt("empid"));
		employee.setAge(resultSet.getInt("age"));
		employee.setDept(resultSet.getString("dept"));
		employee.setEmpName(resultSet.getString("empname"));
		employee.setJobTitle(resultSet.getString("jobtitle"));
		employee.setSalary(resultSet.getDouble("salary"));
	}

	@Override
	public List<Employee> getAllEmployees() {
		Employee employee;
		List<Employee> employeeList = new ArrayList<>();
		try (Connection connection = DriverManager.getConnection(
				"jdbc:postgresql://127.0.0.1:5432/test", "postgres", "password");
			 Statement statement = connection.createStatement();) {
			ResultSet resultSet = statement.executeQuery(QueryMapper.GET_ALL_EMPLOYEES);

			while (resultSet.next()) {
				employee = new Employee();
				populateEmployee(employee, resultSet);
				employeeList.add(employee);
			}
			if (employeeList.size() > 0) {
			
				return employeeList;
			} else {
				throw new Exception("Customer table is empty");
			}
			//return;
		} catch (SQLException sqle) {
			sqle.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return employeeList;
	}

}
