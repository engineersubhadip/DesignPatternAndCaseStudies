package PrototypeDesignPattern.Version1;

public class IntelStudent extends Student {

	private int iq;

	public IntelStudent() {

	}

	public IntelStudent(IntelStudent is) {
		super(is);
		this.setIq(is.getIq());
	}
	
	public IntelStudent(Student st) {
		super(st);
		this.setIq(0);
	}
	
	public int getIq() {
		return iq;
	}

	public void setIq(int iq) {
		this.iq = iq;
	}
}
