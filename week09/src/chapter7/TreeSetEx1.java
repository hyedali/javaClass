package chapter7;

import java.util.TreeSet;

public class TreeSetEx1 {

	public static void main(String[] args) {
		
		TreeSet<Student> test = new TreeSet<Student>();
		
		Student stu1 = new Student("100", "Kim", 80);
		Student stu2 = new Student("300", "Lee", 88);
		Student stu3 = new Student("400", "Park", 78);
		Student stu4 = new Student("100", "Kim", 80); //중복
		Student stu5 = new Student("500", "Choi", 99);
		
		test.add(stu1);
		test.add(stu2);
		test.add(stu3);
		test.add(stu4);
		test.add(stu5);
		
		System.out.println(test);
	}

}

//내가 정의한 클래스를 이용할 때 발생하는 에러 : ClassCastException
//=> 내가 정의한 클래스는 정렬 기능이 없으므로 에러 발생
//=> 정렬기능을 갖도록 해주어야 함

//순서를 결정하기 위해서는 Comparable인터페이스를 사용하면 정렬기능을 보유하게 할 수 있음
