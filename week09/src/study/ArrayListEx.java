package study;

import java.util.ArrayList;
import java.util.Scanner;
//예제 7-3
public class ArrayListEx {

	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<String>();
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<4; i++) {
			System.out.print("이름 입력 >> ");
			String s = scan.next();
			a.add(s);
		}
		
		for(int i=0; i<a.size(); i++) {
			String name = a.get(i);
			System.out.print(name + " ");
		}
		
		int longestIndex = 0;
		
		for(int i=1; i<a.size(); i++) {
			if(a.get(longestIndex).length() < a.get(i).length()) {
				longestIndex = i;
			}
		}
		
		System.out.println("\n가장 긴 이름은 " + a.get(longestIndex));
		scan.close();
		
	}

}
