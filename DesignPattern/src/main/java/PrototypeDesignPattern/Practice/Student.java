package PrototypeDesignPattern.Practice;

public class Student {
	
	String name;
	int age;
	double psp;
	
	public Student() {};
	
	public Student clone() {
		Student st = new Student();
		st.name = this.name;
		st.age = this.age;
		st.psp = this.psp;
		return st;
	}
}
