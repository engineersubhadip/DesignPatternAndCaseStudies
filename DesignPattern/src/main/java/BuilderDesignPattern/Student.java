package BuilderDesignPattern;

public class Student {

	private String name;
	private int age;
	private String univName;

	private Student(Builder build) {
		this.name = build.name;
		this.age = build.age;
		this.univName = build.univName;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getUnivName() {
		return univName;
	}

	public static Builder getBuilder() {
		return new Builder();
	}

	static class Builder {

		private String name;
		private int age;
		private String univName;

		public Student build() {
			if (this.name == null || this.name.length() == 0) {
				throw new RuntimeException("Please enter valid name");
			}
			if (this.age < 18 || this.age > 40) {
				throw new RuntimeException("Please enter valid age");
			}
			if (this.univName == null || this.univName.length() == 0) {
				throw new RuntimeException("Please enter valid University name");
			}
			Student newStudent = new Student(this);
			return newStudent;
		}

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setAge(int age) {
			this.age = age;
			return this;
		}

		public Builder setUnivName(String univName) {
			this.univName = univName;
			return this;
		}
	}
}
