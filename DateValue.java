package core;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFormat dbFormat = new SimpleDateFormat("dd-MMM-yy");
		Calendar cal = Calendar.getInstance();
		Calendar cal1 = Calendar.getInstance();
        SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
        Date today = new Date();
        cal.setTime(today);
        cal.add(Calendar.DATE, 3);
        cal1.setTime(today);
        cal1.add(Calendar.DATE, 1);
        String date = dbFormat.format(cal.getTime());
        String date1 = dbFormat.format(cal1.getTime());
        System.out.println("Date -> "+date);
        System.out.println("Date 1 -> "+date1);
        cal1.setTime(today);
        cal1.add(Calendar.DATE, 0);
        String date2 = dbFormat.format(cal1.getTime());
        System.out.println("Date 2 -> "+date2);
	}

}
