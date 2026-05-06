package studentusingoops;

 class Student{
	String name;
	int rollno;
	
	void printStudent() {
		System.out.println("Name : "+name + "\nRoll no : "+rollno);
	}
}
public class StudentClass {
	public static void main(String[] args) {
		Student st = new Student();
		st.name = "John";
		st.rollno = 2;
		st.printStudent();
	}
}
