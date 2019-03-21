package student;

import java.util.*;

public class StudentProcess {
	
	public static void main (String args[]) {
		
System.out.println("<<<------Task 1: array of students---->>\n");
		
		Student [] students = {				
				new Student("Jack", "Smith", 50.0, "IT");
				new Student("Aaron", "Johnson", 76.0, "IT");
				new Student("Marria", "White", 35.8, "Business");
				new Student("John", "White", 47.0, "Media");
				new Student("Laney", "White", 62.0, "IT");
				new Student("Jack", "Jones", 32.9, "Business");
				new Student("Wesley", "Jones", 42.89, "Media");
		}
			
	List <Student> students = new ArrayList<>();
		
	
	}
		
	//task 2
	//display students with grades in the range 50.5 -100.0,
	//sorted in ascending order by grade
	//(hint: you need to return a Stream<Student> out of your List<Student> first, 
	//and then use Stream and Comparator classes’ methods classes’ methods.)
	
	String studentsForTaskTwo = students.stream().filter(
			
			))
	

}
