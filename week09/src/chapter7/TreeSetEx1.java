package chapter7;

import java.util.TreeSet;

public class TreeSetEx1 {

	public static void main(String[] args) {
		
		TreeSet<Student> test = new TreeSet<Student>();
		
		Student stu1 = new Student("100", "Kim", 80);
		Student stu2 = new Student("300", "Lee", 88);
		Student stu3 = new Student("400", "Park", 78);
		Student stu4 = new Student("100", "Kim", 80); //�ߺ�
		Student stu5 = new Student("500", "Choi", 99);
		
		test.add(stu1);
		test.add(stu2);
		test.add(stu3);
		test.add(stu4);
		test.add(stu5);
		
		System.out.println(test);
	}

}

//���� ������ Ŭ������ �̿��� �� �߻��ϴ� ���� : ClassCastException
//=> ���� ������ Ŭ������ ���� ����� �����Ƿ� ���� �߻�
//=> ���ı���� ������ ���־�� ��

//������ �����ϱ� ���ؼ��� Comparable�������̽��� ����ϸ� ���ı���� �����ϰ� �� �� ����
