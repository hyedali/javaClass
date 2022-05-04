package collectionapi;

public class Student implements Comparable<Student>{
	private String id; //학생 ID
	private String name; //학생 이름
	private int score; //학생 성적

	public Student(String id, String name, int score) {
		this.id = id;
		this.name = name;
		this.score = score;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	//객체 정보를 문자열로 표현하는 메소드
	public String toString() {
		return id + " : " + name + " : " + score;
	}
	
	//객체가 같은지 판별하는 메소드
	public boolean equals(Student stu) {
		boolean result = false;
		
		if(id.equals(stu.id)) {
			return true;
		}
		
		return result;
	}

	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.name);
	}


}
