package exceptionhandlingexample.service;

import exceptionhandlingexample.dao.StudentService;
import exceptionhandlingexample.exceptions.AdmissionCodeException;

public class StudentManager {
	public String getStudentName(String admissionCode) throws AdmissionCodeException {
		String error = "Admission code is null";
		try {
			StudentService service = new StudentService();
			if (admissionCode != null) {
				return service.getStudentName(admissionCode);
			}
		} catch (AdmissionCodeException e) {
			error = e + "\nErrors trapped in service layer";
		}
		throw new AdmissionCodeException(error);

	}
}