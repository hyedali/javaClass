package chapter7;

import java.util.HashSet;
import java.util.Iterator;

//Set : �ߺ� ��� �ȵ�, ���� ����.
//Iterator : �ڷᱸ���� ��� ���� �ϰ��ǰ� �����͸� �ҷ��� �� ����

//String : �ڹ��� api�̹Ƿ� �̹� ���� �Ǿ� �־� equals�� hashCode�� �������̵� �Ǿ� ����!!
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
