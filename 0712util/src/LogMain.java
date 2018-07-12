import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LogMain {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\503-03\\Desktop\\java\\log.txt");
		// 중복 데이터 없이 출력하기 위해서 Set을 쓴다.
		HashSet <String> set = new HashSet();
		try {
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine()) {
				String st = sc.nextLine();
				String[] string = st.split(" ");
				set.add(string[0]);
				//System.out.println(string[0]);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(set);
		
		
		
		

	}

}
