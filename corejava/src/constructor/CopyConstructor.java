package constructor;

class CopyConstructor {

	String name;
	int age;
	String faculty;

	// Normal Parameterized constructor
	CopyConstructor(String name, int age, String faculty) {
		this.name = name;
		this.age = age;
		this.faculty = faculty;
	}

	// Copy constructor
	CopyConstructor(CopyConstructor s) {
		this.name = s.name;
		this.age = s.age;
		this.faculty = s.faculty;
	}

	void display() {
		System.out.println(name + " " + age + " " + faculty);
	}

	public static void main(String[] args) {

		CopyConstructor s1 = new CopyConstructor("Ram", 20, "Science and Technology");
//		s1.name = "Shyam"; // this replace the above declared value "Ram" with "Shyam"
//		s1.age = 35;
		// Copying s1 into s2
		CopyConstructor s2 = new CopyConstructor(s1);
		// if we assign the value of name and age taking s2 object as reference, we can
		// change the value of name and age only in the copied constructor without
		// affecting the original constructor's value
		// example :
		s2.name = "Hari";
		s2.faculty = "Management";
//		s2.age = 22;
		s1.display();
		s2.display();
		
		//======Exception Case===========
		/* Below is not a copy constructor :
		 * s3 refers to same object as s1
		 * CopyConstructor s3 = s1;
		 */
	}
}