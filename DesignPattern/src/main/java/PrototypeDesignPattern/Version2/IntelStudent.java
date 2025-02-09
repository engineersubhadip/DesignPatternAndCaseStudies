package PrototypeDesignPattern.Version2;

public class IntelStudent extends Student {

	private int iq;

	public IntelStudent() {

	}

	public IntelStudent(IntelStudent is) {
		super(is);
		this.setIq(is.getIq());
		System.out.println("This value of IntelStudent: "+this);
	}

	public IntelStudent clone() { // is.clone(); this -> is
		IntelStudent intelStudentCopy = new IntelStudent(this);
		System.out.println("Value of intelStudentCopy: "+intelStudentCopy);
		return intelStudentCopy;
	}

	public int getIq() {
		return iq;
	}

	public void setIq(int iq) {
		this.iq = iq;
	}
}
