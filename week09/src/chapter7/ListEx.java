package chapter7;

import java.util.ArrayList;
import java.util.Iterator;

//List : 중복 허용, 순서 존재

public class ListEx {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("AAA");
		list.add("KKK");
		list.add("CCC");
		list.add("AAA");
		list.add("BBB");
		
		System.out.println(list);
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
