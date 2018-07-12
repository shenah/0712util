import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TrafficSumMain {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\503-03\\Desktop\\java\\log.txt");
		int sum = 0;
		try {
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine()) {
				String st = sc.nextLine();
				String[] ar = st.split(" ");
				//System.out.println(ar[ar.length-1]);
				sum = sum + Integer.parseInt(ar[ar.length-1]);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(sum);

	}

}
