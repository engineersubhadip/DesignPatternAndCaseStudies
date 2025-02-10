package SingletonDesignPattern;

public class Client {

	public static void main(String[] args) {
		Student st = Student.getInstance();
		Student st1 = Student.getInstance();
		
		System.out.println(st);
		System.out.println(st1);
	}

}
