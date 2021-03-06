import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class MapExam {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		//key와 value값을 put으로 저장
		map.put("001", "kim");
		map.put("002", "lee");
		map.put("003", "choi");
		// 같은 key가 2개 있을 수 없습니다.
		map.put("001", "kang");
		//map에 저장된 자료의 수를 출력합니다.
		System.out.println(map.size());
		//키가 001,002,003인 값을 꺼내 출력합니다.
		System.out.println(map.get("001"));
		System.out.println(map.get("002"));
		//map에 저장된 모든 key들을 Set자료구조로 꺼냅니다.
		Set<String> keys = map.keySet();
		
		//Set 자료구조에 있는 모든 key를 꺼내기 위하여 Iterator를 구합니다.
		Iterator<String> iter = keys.iterator();
		while (iter.hasNext()) {
			//key를 꺼냅니다.
			String key = iter.next();
			//key에 해당되는 value를 꺼냅니다.
			String value = map.get(key);
			//key와 value를 출력합니다.
			System.out.println(key + ":" + value);
		}
		
	}

}
