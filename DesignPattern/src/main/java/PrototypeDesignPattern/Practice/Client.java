package PrototypeDesignPattern.Practice;

public class Client {

	public static void main(String[] args) {
		
		Student st = new Student();
		Student stCopy = st.clone();
		Student stCopy2 = st.clone();
		
		System.out.println("Student: "+st);
		System.out.println("Student Copy: "+stCopy);
		System.out.println("Student Copy2: "+stCopy2);
	}
}
