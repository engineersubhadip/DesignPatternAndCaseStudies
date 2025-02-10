package BuilderDesignPattern;

public class Client {

	public static void main(String[] args) {
		Student st = Student.getBuilder().setName("Amartya").setAge(29).setUnivName("NMIS").build();
		
		System.out.println("Name: "+st.getName());
		System.out.println("Age: "+st.getAge());
		System.out.println("Uni Name: "+st.getUnivName());
		
		Student st1 = Student.getBuilder().setName("Parikshit").setAge(42).setUnivName("Symbiosis").build();
		System.out.println(st1); // You will run into exception. You will not be able to create an object, until you provide valid age
	}

}
