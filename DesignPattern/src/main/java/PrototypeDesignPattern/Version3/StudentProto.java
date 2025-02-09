package PrototypeDesignPattern.Version3;

public class StudentProto {
	
	double avgPSP;
	String batchName;
	
	public Student copy() {
		Student st = new Student();
		st.avgPSP = this.avgPSP;
		st.batchName = this.batchName;
		return st;
	}
}
