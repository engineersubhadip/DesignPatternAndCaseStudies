package PrototypeDesignPattern.FinalVersion;

public class Student implements Prototype<Student>{

	private String name;
	private int age;
	
	public Student() {
		
	}
	
	public Student(Student s) {
		this.setAge(s.getAge());
		this.setName(s.getName());
	}
	
	public Student clone() { // st.clone(); this -> st
		Student stCopy = new Student(this);
		return stCopy;
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
