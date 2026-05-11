package encapsulation;

public class Test {
	public void main(String[] args) {
		Customer c = new Customer();
		
		c.setId(3432);
		c.setName("Khush");
		c.setAge(22);
		c.setPhone("9804449814");
		
//		System.out.println("Id : "+c.getId());
//		System.out.println("Name : "+c.getName());
//		System.out.println("Age : "+c.getAge());
//		System.out.println("Phone : "+c.getPhone());
		
		// Calling toString method
		System.out.println(c);
		
		
	}
}
