package chapter7;

import java.util.HashMap;
import java.util.Scanner;

//예제 7-5
public class HashMapDicEx {

	public static void main(String[] args) {
		
		HashMap<String, String> dic = new HashMap<String, String>(); //해시맵 생성
		//var dic = new HashMap<String, String>();으로 간략히 써도 됨 
		
		//3개의 (Key, Value) 쌍을 dic에 저장
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		
		//사용자로부터 영어 단어를 입력받고 한글 단어 검색. "exit" 입력받으면 종료
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("찾고 싶은 단어는? >> ");
			String eng = scan.next();
			
			if(eng.equals("exit")) {
				System.out.println("종료합니다...");
				break;
			}
			
			//해시맵에서 '키' eng의 '값' kor 검색
			String kor = dic.get(eng);
			if(kor == null) {
				System.out.println(eng + "는 없는 단어입니다.");
			}else {
				System.out.println(kor);
			}
		}
		
		scan.close();
	}

}
