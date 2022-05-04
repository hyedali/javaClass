package chapter7;

import java.util.HashSet;

//���� ������ Ŭ������ �̿��Ҷ����� studentŬ���� �� ����!

//Hash��� �̸��� �ڷᱸ���� ���ɶ��� ��! hashCode�� �������̵� �Ͽ��� ��!!
public class HashSetEx1 {

	public static void main(String[] args) {
		//���� ���� ��ü�� ���� ���� equals(), hashCode()�� �������̵� ���־�� �Ѵ�.
		HashSet<Student> set = new HashSet<Student>();
		
		Student stu1 = new Student("100", "Kim", 80);
		Student stu2 = new Student("300", "Lee", 88);
		Student stu3 = new Student("400", "Park", 78);
		Student stu4 = new Student("100", "Kim", 80); //�ߺ�
		Student stu5 = new Student("500", "Choi", 99);
		
		set.add(stu1);
		set.add(stu2);
		set.add(stu3);
		set.add(stu4);
		set.add(stu5);
		
		System.out.println(set);
		
		System.out.println(stu1.hashCode());
		System.out.println(stu4.hashCode());
		
		System.out.println(stu1.equals(stu4));
		
	}

}
