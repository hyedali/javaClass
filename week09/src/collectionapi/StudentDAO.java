package collectionapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentDAO {
	
	private Scanner scan;
	private ArrayList<Student> al;
	
	private String id;
	private String name;
	private int score;
	
	StudentDAO(){
		//list = new Student[100]; //등록가능한 학생 수 100명
		scan = new Scanner(System.in);
		al = new ArrayList<Student>();
	}

	public void insert() {
		System.out.print("학번 입력 >> ");
		id = scan.nextLine();
		
		for(int i=0; i<al.size(); i++) {
			Student stu1 = al.get(i);
			
			if(id.equals(stu1.getId())) {
				System.out.println("이미 존재하는 ID입니다.");
				return;
			}
		}
		
		System.out.print("이름 입력 >> ");
		name = scan.nextLine();
		
		System.out.print("성적 입력 >> ");
		score = 0;
		
		Student stu;
		boolean ch_score = true;
		try {
			do {
				score = Integer.parseInt(scan.nextLine());
				
				if(score>=0 && score<=100) {
					ch_score = false;
					
					stu = new Student(id, name, score);
					al.add(stu);
					
					System.out.println("등록이 완료되었습니다.");
					break;
				}
				
				System.out.println("범위를 벗어났습니다. 다시 입력해주세요.");
				System.out.print("성적 입력 >> ");
				
			}while(ch_score);
			
		}catch(NumberFormatException e) {
			System.out.println("정수가 아닌 문자를 입력하였습니다.");
		}
		
		
	}
	
	//2. 조회
	public void inquire() {
		for(int i=0; i<al.size(); i++) {
			System.out.println("ID :" + al.get(i).getId() + " 이름 :" + al.get(i).getName() + " 성적 :" + al.get(i).getScore());
		}
	}
	
	//3. 수정
	public void update() {
		System.out.print("수정 할 id 입력하시오. : ");
		id  = scan.nextLine();
		
		for(int i=0; i < al.size(); i++) {
			Student stu = al.get(i);
			
			if(id.equals(stu.getId())) {
				al.remove(i);
			}else {
				System.out.println("수정 할 ID가 없습니다.");
				return;
			}
		}
		
		insert();
		
	}
	
	//4. 삭제
	public void delete() {
		System.out.print("삭제할 학생 ID를 입력하시오. >> ");
		id = scan.nextLine();
		boolean found = false;
		int tempIndex = 0;
		
		for(int i=0; i<al.size(); i++) {
			Student stu = al.get(i);
			
			if(id.equals(stu.getId())) {
				found = true;
				tempIndex = i;
			}
		}
		
		if(found) {
			al.remove(tempIndex);
			System.out.println("해당 ID가 삭제되었습니다.");
		}else {
			System.out.println("삭제할 ID가 없습니다.");
		}
	}
	
	//이름순으로 정렬
	public void nameSort() {
		Collections.sort(al);
		inquire();
	}
	
	//성적순으로 정렬
	public void scoreSort() {
		Comparator comparator = new ScoreComparator();
		Collections.sort(al, comparator);
		inquire();
	}
}

//보완할 점
// 성적 : 0 ~ 100점까지만 입력되도록 조건 설정

//정렬을 하기 위해서는...