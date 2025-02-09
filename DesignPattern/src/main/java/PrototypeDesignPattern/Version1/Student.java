package PrototypeDesignPattern.Version1;

public class Student {
	
	String name;
	int age;
	double psp;
	
	public Student(String name, int age, double psp) {
		this.name = name;
		this.age = age;
		this.psp = psp;
	}
	
	public Student(Student st) {
		this.name = st.name;
		this.age = st.age;
		this.psp = st.psp;
	}
}
