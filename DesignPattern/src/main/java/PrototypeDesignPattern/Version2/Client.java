package PrototypeDesignPattern.Version2;

public class Client {
	public static void main(String[] args) {
		
//		Student st = new Student();
//		Student stCopy = st.clone();
		
//		Student st = new IntelStudent();
//		Student stCopy = st.clone();
//		
//		System.out.println("St value: "+st);
//		System.out.println("StCopy value: "+stCopy);
		
		IntelStudent is = new IntelStudent();
		IntelStudent isCopy = is.clone();
		
		System.out.println(is);
		System.out.println(isCopy);
	}
}
