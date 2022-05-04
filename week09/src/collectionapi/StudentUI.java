package collectionapi;

import java.util.Scanner;

public class StudentUI {
	private Scanner scan;
	private StudentDAO dao; //등록을 처리하는 곳
	
	StudentUI(){
		scan = new Scanner(System.in);
		dao = new StudentDAO();
	}
	
	public void showUsage() {
		boolean bFlag = true;
		
		while(bFlag) {
			System.out.println("1.등록 2.조회 3.수정 4.삭제 0.종료");
			System.out.println("5.이름순 정렬 6.성적순 정렬");
			
			String menu = scan.nextLine();
			
			if(menu.equals("0")) {
				System.out.println("시스템 종료");
				bFlag = false;
				return;
			}else {
				getUserInput(menu); //재귀적 호출
			}
		}
	}
	
	public void getUserInput(String strMenu) {
		if(strMenu.equals("1")) {
			System.out.println("등록");
			dao.insert();
		}
		else if(strMenu.equals("2")) {
			System.out.println("조회");
			dao.inquire();
		}
		else if(strMenu.equals("3")) {
			System.out.println("수정");
			dao.update();
		}
		else if(strMenu.equals("4")) {
			System.out.println("삭제");
			dao.delete();
		}else if(strMenu.equals("5")) {
			System.out.println("이름순으로 정렬");
			dao.nameSort();
		}else if(strMenu.equals("6")) {
			System.out.println("성적순으로 정렬");
			dao.scoreSort();
		}
		else {
			System.out.println("0 ~ 4 사이의 숫자를 입력하세요!");
		}
	}
	
	//메인이 있으므로 프로그램의 시작점
	public static void main(String[] args) {
		StudentUI ui = new StudentUI();
		ui.showUsage();
	}

}
