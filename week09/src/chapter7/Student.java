package chapter7;

//���� ����� �������� Comparable�������̽�(�߻�޼ҵ�)�� �������־�� �Ѵ�.
public class Student implements Comparable<Student>{
	private String id; //�л� ID
	private String name; //�л� �̸�
	private int score; //�л� ����

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

	//��ü ������ ���ڿ��� ǥ���ϴ� �޼ҵ�
	public String toString() {
		return id + " : " + name + " : " + score;
	}
	
	//��ü�� ������ �Ǻ��ϴ� �޼ҵ�
//	public boolean equals(Student stu) {
//		boolean result = false;
//		
//		if(id.equals(stu.id)) {
//			return true;
//		}
//		
//		return result;
//	}
	
	//equals�� ��! �Ű������� Object���� �޾ƿ;� ��!!!
	public boolean equals(Object obj) {
		boolean result = false;
		
		if(obj instanceof Student) {
			Student stu = (Student) obj;
			return this.id.equals(stu.id);
		}
		
		return result;
	}
	
	public int hashCode() {
		return (id+name+score).hashCode();
	}

	@Override
	public int compareTo(Student o) {
		
		return this.name.compareTo(o.name);
	}

}
