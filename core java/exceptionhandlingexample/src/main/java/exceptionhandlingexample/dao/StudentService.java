package exceptionhandlingexample.dao;

import exceptionhandlingexample.exceptions.AdmissionCodeException;

public class StudentService{

	public String getStudentName(String admissionCode) throws AdmissionCodeException {
		String[][] names = { { "1101", "Ravi Kumar" }, { "1102", "Lakshmi" }, { "1103", "Madhavi" } };

		for (int i = 0; i < names.length; i++) {
			if (names[i][0].equals(admissionCode)) {
				return names[i][1];
			}
		}
		String error = admissionCode + "\nNo such admission code in our records";
		throw new AdmissionCodeException(error);

	}

}
