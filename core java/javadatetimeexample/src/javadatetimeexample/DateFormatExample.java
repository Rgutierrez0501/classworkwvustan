package javadatetimeexample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javadatetimeexample.entity.UserDetails;

public class DateFormatExample {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		//SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
		Date today = new Date();
		System.out.println(today);
		//Using SimpleDateFormat format we are formatting the Date object into a specific format
		System.out.println(sdf.format(today));
		
		Student student = new Student();
		student.setStudentId(1);
		student.setStudentName("George");
		student.setDateOfBirth("12/04/2022");//2022/04/12

		//Converting or parsing the string type or format date into Date object
		System.out.println("Student date of birth in String --"+student.getDateOfBirth());
		String dB= student.getDateOfBirth();
		System.out.println("Value of dB is "+dB);
		Date dateOfBirt= sdf.parse(dB);
		System.out.println("dateOfBirt----"+dateOfBirt);
		
		/**
		Employee emp = new Employee();
		emp.setDateOfBirth(dateOfBirt);*/
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		String dateInString = "12-12-1988";
		System.out.println(formatter.parse(dateInString));
		
		SimpleDateFormat formatters = new SimpleDateFormat("yyyy-MM-dd");
		String dateInStr = "1988-12-13";
		System.out.println(formatters.parse(dateInStr));
		Date parsedDate = formatters.parse(dateInStr);
		System.out.println(parsedDate instanceof Date);
		
		UserDetails userDetails = new UserDetails();
		System.out.println(userDetails);
		userDetails.setUserId(1);
		userDetails.setUserFirstName("Rosa");
		userDetails.setUserLastName("Gutierrez");
		userDetails.setEmail("rosa@gmail.com");
		userDetails.setMobile(9999100211l);
		userDetails.setDateOfBirth(formatters.parse(dateInStr)); 
		System.out.println(userDetails);
	}

}
