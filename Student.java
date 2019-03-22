package student;

//java

public class Student {
	private String firstName;
	private String lastName;
	private double grade;
	private String department;
	

	public Student(String firstName, String lastName, double grade, String department) throws StudentExceptions  {
		if(firstName != null && lastName != null && grade > 0 && department != null) {
			
		this.firstName = firstName;
		this.lastName = lastName;
		this.grade = grade;
		this.department = department;
		}
		else {
			//throws exception
			throw new StudentExceptions();
		}
	}

//setters
//
 public void setFirstName(String fName) { firstName = fName; }
 
 public void setLastName(String lName) { lastName = lName; }
 
public void setDepartment(String department_) {	department = department_;}

public void setGrade(double grade_) {grade = grade_;}

//getters
//
 public double getGrade() {	 return grade; }

 public String getDepartment(){	 return department; }

 public String getLastName() {	 return lastName; }
 
 public String getFirstName() {	 return firstName; }


//getName method
 //returns full name
 //
 @Override
 public String toString() {
	 
	 return  String.format("%-10s %-10s %-10.2f %s", getFirstName(),  getLastName(),  getGrade(),  getDepartment());
 }
 
  public String getName() {
  
 return (firstName + " " + " " + lastName).trim();
	 
 }


}