package chapter7;

import java.util.ArrayList;
import java.util.Scanner;

//���� 7-3
public class ArrayListEx {

	public static void main(String[] args) {
		//���ڿ��� ���� ������ ArrayList ����
		ArrayList<String> a = new ArrayList<String>();
		
		//Ű����κ��� 4���� �̸��� �Է¹޾� ArrayList�� ����
		Scanner scan = new Scanner(System.in); //Scanner��ü ����
		
		for(int i=0; i<4; i++) {
			System.out.print("�̸� �Է� >> ");
			String s = scan.next(); //Ű����κ��� �̸��� �Է�
			a.add(s); //ArrayList �÷��ǿ� ����
		}
		
		//ArrayList�� ����ִ� ��� �̸� ���
		for(int i=0; i<a.size(); i++) {
			String name = a.get(i); //ArrayList�� i��° ���ڿ� ������
			System.out.print(name + " ");
		}
		
		//���� �� �̸� ���
		int logestIndex = 0; //���� ���� �� �̸��� �ִ� ArrayList ���� �ε���
		for(int i=0; i<a.size(); i++) {
			if(a.get(logestIndex).length() < a.get(i).length()) { //�̸� ���� ��
				logestIndex = i; //i��° �̸��� �� �� �̸���
			}
		}
		
		System.out.println("\n���� �� �̸��� " + a.get(logestIndex));
		scan.close();

	}

}
