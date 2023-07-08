import java.util.Calendar;
public class CalendarEx {
	public static void printCalendar(String msg, Calendar cal) {
	    int year = cal.get(Calendar.YEAR);
	    int month = cal.get(Calendar.MONTH) + 1;
	    int day = cal.get(Calendar.DAY_OF_MONTH);
	    int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
	    int hour = cal.get(Calendar.HOUR);
	    int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
	    int ampm = cal.get(Calendar.AM_PM);
	    int minute = cal.get(Calendar.MINUTE);
	    int second = cal.get(Calendar.SECOND);
	    int millisecond = cal.get(Calendar.MILLISECOND);

	    System.out.print(msg + year + "/" + month + "/" + day + "/");
	    switch(dayOfWeek) {
		    case Calendar.SUNDAY : System.out.print("SUNDAY"); break;
		    case Calendar.MONDAY : System.out.print("MONDAY"); break; 
		    case Calendar.TUESDAY : System.out.print("TUESDAY"); break;
		    case Calendar.WEDNESDAY : System.out.print("WEDNESDAY"); break;
		    case Calendar.THURSDAY : System.out.print("THURSDAY"); break;
		    case Calendar.FRIDAY: System.out.print("FRIDAY"); break;
		    case Calendar.SATURDAY : System.out.print("SATURDAY"); break;
	    }
	    System.out.print(" ("+ hourOfDay +")");
	    if(ampm == Calendar.AM) 
	    	System.out.print("a.m.");
	    else
	    	System.out.print("p.m.");
	    
	    System.out.println(hour + ":" + minute + ":" + second + "." +
	    					millisecond + " millisecond");
	}

	public static void main(String[] args) {
	    Calendar now = Calendar.getInstance();
	    printCalendar("Currently, ", now);
 
	    Calendar firstDate = Calendar.getInstance();
	    firstDate.clear();
	    firstDate.set(2021, 6, 16);
	    firstDate.set(Calendar.HOUR_OF_DAY, 10);
	    firstDate.set(Calendar.MINUTE, 30);
	    printCalendar("Our first date is ", firstDate);
	}
}