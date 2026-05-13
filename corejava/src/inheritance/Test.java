package inheritance;

public class Test {
	public static void main(String[] args) {
		Programmer p = new Programmer();

		p.id = 42543;
		p.name = "Hari Sha";
		p.company = "ZyloBrains";
		p.salary = 9_00_000;
		p.progLang = "Java";
		p.bonus = 50000;
		p.project = "ERP";
		
		p.print();
	}
}
