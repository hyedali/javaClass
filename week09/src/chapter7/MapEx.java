package chapter7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

//Map : Key�� Value�� ����
//Key : �ߺ� ��� �ȵ�. - set�迭!
//Value : �ߺ� ���

public class MapEx {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "Java");
		map.put(3, "Java");
		map.put(4, "C");
		map.put(1, "JavaScript"); //key�� �ߺ��� ��� ���� �ֱٿ� ���� �����Ͱ� ���δ�.
		map.put(5, "Java");
		
		System.out.println(map);
		
		//map���� key������ ����
		Set<Integer> keySet = map.keySet();
		
		Iterator it = keySet.iterator();
		
		while(it.hasNext()) {
			int key = (int) it.next();
			System.out.println(key + " : " + map.get(key));
		}
		
	}

}
