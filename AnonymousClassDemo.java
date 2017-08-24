package trng.innerclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonymousClassDemo {

	static Comparator studentIdCom = getStudetIdComparator();

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(123, "Raj", 25));
		students.add(new Student(121, "Kumar", 45));
		students.add(new Student(122, "Mohan", 28));
		students.add(new Student(124, "Kavitha", 35));
		students.add(new Student(127, "Mohan", 15));
		students.add(new Student(125, "Amar", 85));
		students.add(new Student(126, "Ranu", 95));

		// Id
		Collections.sort(students, studentIdCom);
		System.out.println("Student data sorted by id");
		displayData(students);
		
		// Name
		Collections.sort(students, new Comparator<Student>() {

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
		});
		System.out.println("Student data sorted by name");
		displayData(students);
		
		
		// Marks
		Collections.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				final int BEFORE = -1;
				final int EQUAL = 0;
				final int AFTER = 1;

				// Then compare by marks, high marks first.
				if (s1.marks > s2.marks)
					return BEFORE;
				if (s1.marks < s2.marks)
					return AFTER;

				return 0;
			}
		});
		System.out.println("Student data sorted by marks");
		displayData(students);
	}

	private static void displayData(List<Student> students) {
		for(Student student : students) {
			System.out.println(student);
		}
		
	}

	private static Comparator getStudetIdComparator() {
		return new Comparator<Student>() {

			@Override
			public int compare(final Student s1, final Student s2) {
				final int BEFORE = -1;
				final int EQUAL = 0;
				final int AFTER = 1;


				// Then compare by marks, high marks first.
				if (s1.studentId > s2.studentId)
					return AFTER;
				if (s1.studentId < s2.studentId)
					return BEFORE;

				return 0;
			}
		};
	}

}
