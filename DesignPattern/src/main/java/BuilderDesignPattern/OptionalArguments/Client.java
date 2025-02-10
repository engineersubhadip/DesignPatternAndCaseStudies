package BuilderDesignPattern.OptionalArguments;

public class Client {

	public static void main(String[] args) {
		/*
		// Providing only mandatory fields :-
		
		Student st = Student.getBuilder().setAge(22).setName("Bachmann").build();
		
		System.out.println(st);
		System.out.println(st.getName());
		System.out.println(st.getAge());
		System.out.println(st.getUniName());
		
		We are able to create "st" object by only providing the MANDATORY fields.
		*/
		
		/*
//		Providing only optional fields :-
		Student st = Student.getBuilder().setUniName("Arkansa").build();
		System.out.println(st); 
		// "st" object will not be created as we have NOT passed Mandatory fields.
		///
		 */
		
//		Providing 1 Mandatory and 1 Optional
		Student st = Student.getBuilder().setAge(25).setUniName("Arkansas").build();
		System.out.println(st);
//		We are unable to create "st" object as we have not passed Mandatory field called "Name"
	}

}
