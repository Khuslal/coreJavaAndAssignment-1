package student.details.using.oops;

public class StudentDetailsUsingOOP {
	public static void main(String[] args) {
		// creating 1st object of students class
		Students s1 = new Students();
		s1.name = "Sam";
		s1.address = "Kathmandu";
		s1.phone = "9800000123";
		s1.rollno = 34;
		// creating 2nd object of same class
		Students s2 = new Students();
		s2.name = "John";
		s2.address = "Butwal";
		s2.phone = "9800000001";
		s2.rollno = 12;
		s1.printStudentDetails();
		System.out.println();
		s2.printStudentDetails();
	}
}
