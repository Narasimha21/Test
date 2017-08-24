package trng.innerclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StaticNesterClassUsage {

	List<Student> students;

	public StaticNesterClassUsage() {
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
		StaticNesterClassUsage comparableTest = new StaticNesterClassUsage();
		System.out.println("Student info before sorting....");
		comparableTest.displayStudents();
		
		Collections.sort(comparableTest.students, new Student.StudentComparator());
		System.out.println("Student info after sorting by name....");
		comparableTest.displayStudents();
	}
}