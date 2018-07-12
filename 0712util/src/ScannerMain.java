import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String msg = sc.next();
		System.out.println(msg);
		sc.close();
		
		sc = new Scanner("Hello world");
		System.out.println(sc.next());
		System.out.println(sc.next());
		sc.close();
		//File 객체 만들기
		File f = new File("C:\\JavaProgramming\\source\\0712util\\src\\CalendarMain.java");//path 입력시 역슬래시를 두번 
		//파일과 연결되는 스캐너 객체 만들기
		try {
			sc=new Scanner(f);
			/*데이터가 있을 때까지 읽기 
			 * 파일이 있는데 내용을 못읽는 경우는 2가지 경우 인데
			 * 1. 구분문자가 없는 경우 2.한글 인코딩이 다른 경우
			 * 인코딩이 다른 경우는 한글이 깨지는게 아니고 scanner가
			 * 읽지 못한다. 공백문자의 코드 값이 다르기 때문이다.
			 */
			while(sc.hasNext()) {
				System.out.println(sc.next());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
