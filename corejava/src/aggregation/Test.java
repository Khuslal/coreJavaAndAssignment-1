package aggregation;

public class Test {
	public static void main(String[] args) {
		Bike b = new Bike();
		b.setColor("Red");
		b.setCompany("Honda");
		b.setPrice(180_000);

		Student s = new Student();
		s.setId(234);
		s.setName("Shyam");
		s.setCollege("NCC");
		s.setBike(b);

		System.out.println("ID : " + s.getId());
		System.out.println("Name : " + s.getName());
		System.out.println("College : " + s.getCollege());
		System.out.println("==========Bike Info==========");
		System.out.println("Color : " + s.getBike().getColor());
		System.out.println("Price : " + s.getBike().getPrice());
		System.out.println("Company : " + s.getBike().getCompany());
	}
}
