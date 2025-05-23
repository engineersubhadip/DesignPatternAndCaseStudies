package PrototypeDesignPattern.Version1;

public class Student {
	
	private String name;
	private int age;
	
	public Student() {
		
	}
	
	public Student(Student s) {
		this.setName(s.getName());
		this.setAge(s.getAge());
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
