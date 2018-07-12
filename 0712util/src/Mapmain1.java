import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class Mapmain1 {

	public static void main(String[] args) {
		// 이름 나이 및 소속 회사 저장하는 Map을 생성 - 순서없이
		//HashMap <String, Object> map = new HashMap();
		// 저장한 순서따라 
		//LinkedHashMap <String, Object> map = new LinkedHashMap();
		// 
		TreeMap<String, Object> map = new TreeMap();
		map.put("name", "바네사");
		map.put("age", 28);
		map.put("company","Hollywood");
		
		//전체 한꺼번에 출력 - toString이 재저의 되어 있음.
		System.out.println(map);
		//순서에 상관없이 항목별로 출력
		Set <String> keys = map.keySet();
		for(String temp : keys) {
			System.out.println(temp + ":" + map.get(temp));
		}
		

	}

}
