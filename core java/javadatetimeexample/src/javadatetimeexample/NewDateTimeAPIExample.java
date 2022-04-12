package javadatetimeexample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class NewDateTimeAPIExample {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		System.out.println(LocalDate.now(ZoneId.of("America/Los_Angeles")));
		System.out.println(LocalDateTime.now(ZoneId.of("America/Los_Angeles")));
		
		Course course = new Course();
		course.setCourseId(1);
		course.setCourseDetails("Java Programming");
		course.setEnrolledDate(LocalDate.now());
		System.out.println(course);
		System.out.println("****************Other LocalDate methods*********");
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getDayOfYear());
		System.out.println(date.getMonthValue());
		System.out.println(date.getDayOfWeek());
		System.out.println(date.getYear());
		System.out.println(date.getMonth());
		
		System.out.println(LocalDate.ofYearDay(2022, 100));
		System.out.println(LocalDateTime.of(2022, 3, 1, 11, 45));
		
		System.out.println(date.format(DateTimeFormatter.ofPattern("dd-MMM-yy")));
	}

}
