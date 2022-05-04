package chapter7;

import java.util.HashSet;

//내가 정의한 클래스를 이용할때에는 student클래서 잘 봐라!

//Hash라는 이름의 자료구조가 사용될때는 꼭! hashCode를 오버라이딩 하여야 함!!
public class HashSetEx1 {

	public static void main(String[] args) {
		//내가 만든 객체를 넣을 때는 equals(), hashCode()를 오버라이딩 해주어야 한다.
		HashSet<Student> set = new HashSet<Student>();
		
		Student stu1 = new Student("100", "Kim", 80);
		Student stu2 = new Student("300", "Lee", 88);
		Student stu3 = new Student("400", "Park", 78);
		Student stu4 = new Student("100", "Kim", 80); //중복
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
