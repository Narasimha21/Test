package trng.innerclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnnonymousInnserClassUsage {

	List<Student> students;

	public AnnonymousInnserClassUsage() {
		students = new ArrayList<>();
		students.add(new Student(123, "Raj", 25));
		students.add(new Student(121, "Kumar", 45));
		students.add(new Student(122, "Mohan", 28));
		students.add(new Student(124, "Kavitha", 35));
		students.add(new Student(127, "Mohan", 15));
		students.add(new Student(125, "Amar", 85));
		students.add(new Student(126, "Ranu", 95));
	}

	public void displayStudents() {
		for (Student student : students) {
			System.out.println(student);
		}
	}

	public static void main(String[] args) {
		AnnonymousInnserClassUsage comparableTest = new AnnonymousInnserClassUsage();
		System.out.println("Student info before sorting....");
		comparableTest.displayStudents();
		
		Collections.sort(comparableTest.students, new Comparator<Student>() {

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
		
		
		System.out.println("Student info after sorting by marks....");
		comparableTest.displayStudents();
		
		
		Collections.sort(comparableTest.students, new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				final int BEFORE = -1;
				final int EQUAL = 0;
				final int AFTER = 1;

				// Then compare by marks, high marks first.
				return s1.name.compareTo(s2.name);
			}
		});
		
		
		System.out.println("Student info after sorting by names....");
		comparableTest.displayStudents();
	}
}