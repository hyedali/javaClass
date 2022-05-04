package chapter7;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		
		TreeSet<String> test = new TreeSet<String>();
		
		test.add("CCC");
		test.add("AAA");
		test.add("PPP");
		test.add("AAA"); //ม฿บน
		test.add("BBB");
		
		System.out.println(test);
		
	}

}
