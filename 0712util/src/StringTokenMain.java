import java.util.StringTokenizer;

public class StringTokenMain {

	public static void main(String[] args) {
		String msg = "I'm on the dream tour.";
		//String의 split()메소드를 사용
		String [] ar = msg.split(" ");
		for(String token : ar) {
			System.out.println(token);
		}
		//StringTokenizer클래스의 메소드 사용
		StringTokenizer stz = new StringTokenizer(msg, " ");
		while(stz.hasMoreTokens()) {
			System.out.println(stz.nextElement());
		}
		
		String data = "90, 80, 70, 60";
		//String[] arr = data.split(", ");
		StringTokenizer st = new StringTokenizer(data, ", ");
		int num = 0;
		while(st.hasMoreTokens()) {
			num = num + (Integer) st.nextElement();
		}
		System.out.println(num);
	}

}
