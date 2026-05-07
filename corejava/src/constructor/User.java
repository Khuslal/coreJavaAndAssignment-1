package constructor;

public class User {
	String username;
	String password;

	// ============default constructor============
//	User(){
//		username = "root";
//		password = "123";
//	}

	// ============Parameterized Constructor===============
//	User(String user, String pass){
//		username = user;
//		password = pass;
//	}

	// 'this.username' refers to the instance variable of the current object,
	// while 'username' refers to the constructor parameter.
	// This assigns the passed value to the object's username field.
	User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	void printUser() {
		System.out.println("Username = " + username);
		System.out.println("Password = " + password);
	}

	public static void main(String[] args) {
		// Calling default constructor
		User u = new User("John", "John123");
		u.printUser();
	}
}
