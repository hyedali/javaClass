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
		//list = new Student[100]; //��ϰ����� �л� �� 100��
		scan = new Scanner(System.in);
		al = new ArrayList<Student>();
	}

	public void insert() {
		System.out.print("�й� �Է� >> ");
		id = scan.nextLine();
		
		for(int i=0; i<al.size(); i++) {
			Student stu1 = al.get(i);
			
			if(id.equals(stu1.getId())) {
				System.out.println("�̹� �����ϴ� ID�Դϴ�.");
				return;
			}
		}
		
		System.out.print("�̸� �Է� >> ");
		name = scan.nextLine();
		
		System.out.print("���� �Է� >> ");
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
					
					System.out.println("����� �Ϸ�Ǿ����ϴ�.");
					break;
				}
				
				System.out.println("������ ������ϴ�. �ٽ� �Է����ּ���.");
				System.out.print("���� �Է� >> ");
				
			}while(ch_score);
			
		}catch(NumberFormatException e) {
			System.out.println("������ �ƴ� ���ڸ� �Է��Ͽ����ϴ�.");
		}
		
		
	}
	
	//2. ��ȸ
	public void inquire() {
		for(int i=0; i<al.size(); i++) {
			System.out.println("ID :" + al.get(i).getId() + " �̸� :" + al.get(i).getName() + " ���� :" + al.get(i).getScore());
		}
	}
	
	//3. ����
	public void update() {
		System.out.print("���� �� id �Է��Ͻÿ�. : ");
		id  = scan.nextLine();
		
		for(int i=0; i < al.size(); i++) {
			Student stu = al.get(i);
			
			if(id.equals(stu.getId())) {
				al.remove(i);
			}else {
				System.out.println("���� �� ID�� �����ϴ�.");
				return;
			}
		}
		
		insert();
		
	}
	
	//4. ����
	public void delete() {
		System.out.print("������ �л� ID�� �Է��Ͻÿ�. >> ");
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
			System.out.println("�ش� ID�� �����Ǿ����ϴ�.");
		}else {
			System.out.println("������ ID�� �����ϴ�.");
		}
	}
	
	//�̸������� ����
	public void nameSort() {
		Collections.sort(al);
		inquire();
	}
	
	//���������� ����
	public void scoreSort() {
		Comparator comparator = new ScoreComparator();
		Collections.sort(al, comparator);
		inquire();
	}
}

//������ ��
// ���� : 0 ~ 100�������� �Էµǵ��� ���� ����

//������ �ϱ� ���ؼ���...