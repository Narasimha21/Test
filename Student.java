package trng.innerclass;

import java.util.Comparator;

class Student {

	protected int studentId;
	protected String name;
	protected int marks;

	public Student(int studentId, String name, int marks) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.marks = marks;
	}

	public Student() {

	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", marks=" + marks + "]";
	}

	// Static nested class
	static class StudentComparator implements Comparator<Student> {

		@Override
		public int compare(Student s1, Student s2) {
			final int BEFORE = -1;
			final int EQUAL = 0;
			final int AFTER = 1;

			// Then compare by name
			if (s1.name.compareTo(s2.name) > 0)
				return AFTER;
			if (s1.name.compareTo(s2.name) < 0)
				return BEFORE;

			return 0;
		}
	}
}