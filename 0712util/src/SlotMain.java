import java.util.ArrayList;
import java.util.Random;

public class SlotMain {

	public static void main(String[] args) {
		ArrayList <String> list = new ArrayList();
		list.add("!");
		list.add("@");
		list.add("#");
		list.add("$");
		list.add("%");
		list.add("^");
		list.add("&");
		list.add("*");
		
		String slot ="";
		Random r = new Random();
		for(int i=0; i<3; i++) {
			slot = slot + list.get(r.nextInt(list.size()));
		}
		System.out.println(slot);
		//3개의 문자 동일한 지 확인
		if(slot.charAt(0)==slot.charAt(1) && slot.charAt(1)==slot.charAt(2)){
			System.out.println(slot.charAt(0) + "이 3개");
		}
		//앞의 2개 문자만 동일한지 확인
		else if(slot.charAt(0)==slot.charAt(1)){
			System.out.println(slot.charAt(0) + "이 2개");
		}
		//그 이외의 경우
		else{
			System.out.println("꽝입니다!");
		}

	}

}
