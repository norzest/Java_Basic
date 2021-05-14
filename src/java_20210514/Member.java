package java_20210514;

public class Member {
	private String id;
	private String name;
	private int age;
	
	// constructor
	public Member() {
		super();
	}
	public Member(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	// getter, setter
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
