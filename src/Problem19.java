import java.util.Calendar;
import java.util.GregorianCalendar;


public class Problem19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long beg = System.nanoTime();
		GregorianCalendar calendar = new GregorianCalendar(1901, Calendar.JANUARY, 1);
		GregorianCalendar end = new GregorianCalendar(2000, Calendar.DECEMBER, 31);
		int sunCount = 0;
		while(!calendar.equals(end)){
			if(calendar.get(Calendar.DAY_OF_MONTH) == 1 &&
					calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
				sunCount++;
			}
			calendar.add(Calendar.DATE, 1);
		}
		double time = (System.nanoTime() - beg) / 1000000000.0;
		System.out.println("Problem 19: There were " + sunCount + 
				" sundays on the first of the month " + 
				" in " + time + " seconds.");
	}

}
