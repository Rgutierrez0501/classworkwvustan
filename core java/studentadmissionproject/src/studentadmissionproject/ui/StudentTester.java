package studentadmissionproject.ui;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class StudentTester {

	public static void main(String[] args) {
		Date input = new Date();
		LocalDate date = input.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();


	}

}
