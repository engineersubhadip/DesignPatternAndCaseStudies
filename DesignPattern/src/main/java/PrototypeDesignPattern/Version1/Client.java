package PrototypeDesignPattern.Version1;

public class Client {

	public static void main(String[] args) {
		
		Student s1 = new Student("Jhilik", 29, 85.76);
		Student s2 = new Student(s1);
		
		System.out.println("Student s1: "+s1);
		System.out.println("Student s2: "+s2);
	}

}
