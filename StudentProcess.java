package student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;
import java.util.*;

public class StudentProcess {

	public static void main(String args[]) {

		try {
			Student[] students = { new Student("Jack", "Smith", 50.0, "IT"),
					new Student("Aaron", "Johnson", 76.0, "IT"), new Student("Marria", "White", 35.8, "Business"),
					new Student("John", "White", 47.0, "Media"), new Student("Laney", "White", 62.0, "IT"),
					new Student("Jack", "Jones", 32.9, "Business"), new Student("Wesley", "Jones", 42.89, "Media") };

			List<Student> studentsList = Arrays.asList(students);

			// Task 1
			System.out.println("Task 1: ");
			System.out.println("\nComplete Student list: ");

			// prints all the students in list
			//
			studentsList.forEach(System.out::println);

			// task 2
			System.out.println("\nTask 2: ");
			System.out.println("\nStudents who got 50.0- 100.0 sorted by grade: ");

			studentsList.stream().filter(t -> 100 >= t.getGrade() && t.getGrade() >= 50).sorted(Comparator.comparing(Student::getGrade))
					.forEach(System.out::println);

			
			// Task 3
			System.out.println("\nTask 3: ");
			System.out.println("\nFirst Student who got 50.0 - 100.0");
			Stream<Student> sortStream = studentsList.stream().sorted(Comparator.comparing(Student::getGrade));
			sortStream = studentsList.stream().sorted(Comparator.comparing(Student::getGrade));

			/***
			 * A container object which may or may not contain a non-null value. If a value
			 * is present, isPresent() will return true and get() will return the value.
			 ***/

			Optional<Student> firstStudent = sortStream.filter(t -> 100 >= t.getGrade() && t.getGrade() >= 50)
					.findFirst();
			
			firstStudent.ifPresent(System.out::println); // first student with grade between 50-100

			
			
			// Task 4
			// students in acending order and decending order
			//
			
			System.out.println("\nTask 4: ");
			System.out.println("\nStudents in ascending order by last name then first: ");

			studentsList.stream()
					.sorted(Comparator.comparing(Student::getLastName).thenComparing(Student::getFirstName))
					.forEach(System.out::println);

			System.out.println("\nStudents in descending order by last name then first: ");

			studentsList.stream()
					.sorted(Comparator.comparing(Student::getLastName).thenComparing(Student::getFirstName).reversed())
					.forEach(System.out::println);

				
			// Task 5
			//prints the unique last names
			//Hint:
			//hint: you need to return a Stream<Student> out of your List<Student> first,
			//and map it to a Stream<String>, and use its methods.)
			//
			
			System.out.println("\nTask 5: ");
			System.out.println("\nUnique Student last names: ");

			Stream<String> lastNames = studentsList.stream().map(Student::getLastName);

			lastNames.distinct().sorted((lastName1, lastName2) -> lastName1.compareTo(lastName2))
					.forEach(System.out::println);

		} catch (StudentExceptions ex) {
			System.out.println("Error Occured: " + ex.getMessage());
		}
	}
}