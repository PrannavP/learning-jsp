package modal;

public class Student {

	private int id;
	private String name;
	private String address;
	private String hobby;
	private int age;
	
	public Student() {
		super();
	}
	
	public Student(int id, String name, String address, String hobby, int age) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.hobby = hobby;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}	
}