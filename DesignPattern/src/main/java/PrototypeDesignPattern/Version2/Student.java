package PrototypeDesignPattern.Version2;

public class Student {
	
	private String name;
	private int age;
	
	public Student() {
		
	}
	
	public Student (Student st) {
		this.setAge(st.getAge());
		this.setName(st.getName());
		System.out.println("this value: "+this);
	}
	
	public Student clone() { // stu.clone(); this -> stu
		Student studentCopy = new Student(this);
		System.out.println("Student Copy: "+studentCopy);
		return studentCopy;
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
