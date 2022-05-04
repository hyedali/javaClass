package chapter7;

import java.util.HashSet;
import java.util.Iterator;

//Set : 중복 허용 안됨, 순서 없음.
//Iterator : 자료구조와 상관 없이 일관되게 데이터를 불러올 수 있음

//String : 자바의 api이므로 이미 구현 되어 있어 equals와 hashCode가 오버라이딩 되어 있음!!
public class SetEx {
	
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		set.add("AAA");
		set.add("KKK");
		set.add("CCC");
		set.add("AAA");
		set.add("BBB");
		
		System.out.println(set);
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
