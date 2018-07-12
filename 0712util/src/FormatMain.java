import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatMain {

	public static void main(String[] args) {
		Date date = new Date();
		int money = 6570000;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월dd일 EEE a hh시mm분ss초");
		String msg = sdf.format(date);
		System.out.println(msg);
		//\6,570,000로 출력
		DecimalFormat df = new DecimalFormat("\u00A4 #,###");
		msg = df.format(money);
		System.out.println(msg);
	}

}
