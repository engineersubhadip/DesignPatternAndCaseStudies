package PrototypeDesignPattern.Version3;

public class Client {
	
	public static void setProto() {
		StudentProto july23 = new StudentProto();
		july23.avgPSP = 80;
		july23.batchName = "July23";
		StudentRegistry.setProto("july23", july23);
	}
	
	public static void main(String[] args) {
		setProto();
		Student aman = StudentRegistry.getProto("july23").copy();
		aman.name = "Aman";
		aman.age = 23;
		aman.psp = 88;
		
		Student rishabh = StudentRegistry.getProto("july23").copy();
		rishabh.name = "Rishabh";
		rishabh.age = 22;
		rishabh.psp = 72;
		
		System.out.println(aman);
		System.out.println(rishabh);

	}

}
