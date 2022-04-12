package javadatetimeexample;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getFirstDayOfWeek());
		System.out.println(cal.getWeekYear());
		System.out.println(cal.getTime());
	}

}
