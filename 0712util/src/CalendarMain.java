import java.util.Calendar;
import java.util.Date;


public class CalendarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar bornDay =Calendar.getInstance();
		bornDay.set(Calendar.YEAR, 1995);
		bornDay.set(Calendar.MONTH, 1);
		bornDay.set(Calendar.DAY_OF_MONTH, 26);

		//System.out.println(bornDay);
		Date date = new Date(bornDay.getTimeInMillis());
		System.out.println(date);
		
		Calendar today = Calendar.getInstance();
		long gap = today.getTimeInMillis() - bornDay.getTimeInMillis();
		System.out.println("태어난지" + (gap/24/60/60/1000) + "일 되었습니다.");
	}

}
