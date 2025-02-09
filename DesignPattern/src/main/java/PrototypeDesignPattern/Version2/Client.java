package PrototypeDesignPattern.Version2;

public class Client {

	public static void main(String[] args) {
		
		Student st = new Student();
		Student stCopy = st.copy();
		System.out.println("St: "+st);
		System.out.println("stCopy: "+stCopy);
		System.out.println("---------------------");
		
		Student st1 = new IntelStudent();
		Student st1Copy = st1.copy();
		System.out.println("St1: "+st1);
		System.out.println("St1 Copy: "+st1Copy);
		
	}

}
