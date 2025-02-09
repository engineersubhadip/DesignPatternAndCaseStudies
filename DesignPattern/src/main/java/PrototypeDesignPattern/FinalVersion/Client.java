package PrototypeDesignPattern.FinalVersion;

public class Client {

	public static void setStudentProto() {

		Student twelveProto = new Student();
		twelveProto.setAge(12);
		Registry.setProto("twelveProto", twelveProto);

		Student thirteenProto = new Student();
		thirteenProto.setAge(13);
		Registry.setProto("thirteenProto", thirteenProto);
	}

	public static void main(String[] args) {
		setStudentProto();
		
		Student ashish = Registry.getProto("twelveProto").clone();
		ashish.setName("Ashish");
		
		Student mainak = Registry.getProto("twelveProto").clone();
		mainak.setName("Mainak");
		
		Student varun = Registry.getProto("thirteenProto").clone();
		varun.setName("Varun");
		
		System.out.println("Ashish age: "+ashish.getAge()+" Ashish name: "+ashish.getName());
		System.out.println("Mainak age: "+mainak.getAge()+" Mainak name: "+mainak.getName());
		System.out.println("Varun age: "+varun.getAge()+" Varun name: "+varun.getName());
		
	}

}
