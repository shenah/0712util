/*import java.util.HashMap;

public class MapMain2 {

	public static void main(String[] args) {
		// 프로야구 팀 별 선수 명단을 배열로 만들기
		String [] kia = {"윤석민", "안치홍", "김선빈"};
		String [] hanhwa = {"권혁", "정근우"};
		String [] lotte = {"레일리", "이대호"};
		//팀 추가할려면
		String [] nc = {"박석민", "이재학"};
		//String 배열의 배열로 묶기
		//String [][] players = {kia, hanhwa, lotte};
		//팀 추가해서
		//String [][] players = {kia, hanhwa, lotte, nc};
//======================================================= data 생성		
		//배열의 데이터 출력- 팀 추가 할 때 항상 화면 출력도 수정
		
		for(int i=0; i<players.length; i++) {
			//팀 이름 출력하기
			if(i==0) {
				System.out.print("KIA:" + "\t");
			}else if(i==1) {
				System.out.print("hanhwa:" + "\t");
			}else if(i==2) {
				System.out.print("lotte:" + "\t");
			}else if(i==3) {
				System.out.print("nc:" + "\t");
			}
			//작은 배열을 순서대로 가져오기
			String [] imsi = players[i];
			//작은 배열을 데이터 개수만큼 반복
			for(int j=0; j<imsi.length; j++) {
				System.out.print(imsi[j]+"\t");
			}
			System.out.println("");
		}
		
		동일한 의미를 갖는 배열들을 묶을 때 바로 배열이나  리스트로 묶는 것은 바람직하지 않다.
		 *배열이나 리스트는 인덱스를 가지고 구분을 할기 때문에 의미를 부여하지 못한다.
		 *배열이나 리스트를 다시 배열이나 리스트로 묶을 때는 먼저 Map으로 의미를 부여해서 묶은 다음 다시 배열이나 리스트로 묶으라. 
		 

		HashMap<String, Object> map1 = new HashMap();
		map1.put("team", "기아");
		map1.put("data", kia);
		HashMap<String, Object> map2 = new HashMap();
		map2.put("team", "한화");
		map2.put("data", hanhwa);
		HashMap<String, Object> map3 = new HashMap();
		map3.put("team", "롯데");
		map3.put("data", lotte);
		HashMap [] players = {map1, map2, map3};
		for(int i=0; i<players.length; i++) {
			HashMap temp = players[i];
			//팀 이름 출력하기
			System.out.print(temp.get("team") + ":\t");
			for(int j=0; j<3; j++){
				System.out.print(temp.get("data")[j] + ":\t");
			}
			System.out.println("");
		}
	}

}
*/