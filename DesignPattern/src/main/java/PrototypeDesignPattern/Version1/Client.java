package PrototypeDesignPattern.Version1;


public class Client {

	public static void main(String[] args) {
		Student st = new Student();
		Student stCopy = null;
		
		if (st instanceof Student) {
			stCopy = new Student(st);
		} else {
			stCopy = new IntelStudent(st);
		}
	}

}
