package chapter7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

//Map : Key와 Value로 구성
//Key : 중복 허용 안됨. - set계열!
//Value : 중복 허용

public class MapEx {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "Java");
		map.put(3, "Java");
		map.put(4, "C");
		map.put(1, "JavaScript"); //key가 중복된 경우 가장 최근에 넣은 데이터가 쓰인다.
		map.put(5, "Java");
		
		System.out.println(map);
		
		//map에서 key값들을 얻어옴
		Set<Integer> keySet = map.keySet();
		
		Iterator it = keySet.iterator();
		
		while(it.hasNext()) {
			int key = (int) it.next();
			System.out.println(key + " : " + map.get(key));
		}
		
	}

}
