package PrototypeDesignPattern.Version2;

public class Student {
	String name;
	int age;
	
	public Student() {};
	
	public Student copy() {
		Student st = new Student();
		st.name = "Anu";
		st.age = 34;
		return st;
	}
}
