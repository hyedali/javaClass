package collectionapi;

import java.util.Scanner;

public class StudentUI {
	private Scanner scan;
	private StudentDAO dao; //����� ó���ϴ� ��
	
	StudentUI(){
		scan = new Scanner(System.in);
		dao = new StudentDAO();
	}
	
	public void showUsage() {
		boolean bFlag = true;
		
		while(bFlag) {
			System.out.println("1.��� 2.��ȸ 3.���� 4.���� 0.����");
			System.out.println("5.�̸��� ���� 6.������ ����");
			
			String menu = scan.nextLine();
			
			if(menu.equals("0")) {
				System.out.println("�ý��� ����");
				bFlag = false;
				return;
			}else {
				getUserInput(menu); //����� ȣ��
			}
		}
	}
	
	public void getUserInput(String strMenu) {
		if(strMenu.equals("1")) {
			System.out.println("���");
			dao.insert();
		}
		else if(strMenu.equals("2")) {
			System.out.println("��ȸ");
			dao.inquire();
		}
		else if(strMenu.equals("3")) {
			System.out.println("����");
			dao.update();
		}
		else if(strMenu.equals("4")) {
			System.out.println("����");
			dao.delete();
		}else if(strMenu.equals("5")) {
			System.out.println("�̸������� ����");
			dao.nameSort();
		}else if(strMenu.equals("6")) {
			System.out.println("���������� ����");
			dao.scoreSort();
		}
		else {
			System.out.println("0 ~ 4 ������ ���ڸ� �Է��ϼ���!");
		}
	}
	
	//������ �����Ƿ� ���α׷��� ������
	public static void main(String[] args) {
		StudentUI ui = new StudentUI();
		ui.showUsage();
	}

}
