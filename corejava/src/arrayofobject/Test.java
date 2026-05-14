package arrayofobject;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		// store and print data of 10 products

		// create array
		Product prods[] = new Product[2];
		
		Scanner scn = new Scanner(System.in);
		// wite data in array
		for (int i = 0; i < prods.length; i++) {
			
			Product p = new Product();
			System.out.println("Enter Id: ");
			p.setId(scn.nextInt());
			
			System.out.println("Enter Name: ");
			p.setName(scn.next());
			
			System.out.println("Enter Price: ");
			p.setPrice(scn.nextInt());
			
			System.out.println("Enter Company: ");
			p.setCompany(scn.next());

			prods[i] = p;
		}

		// read data from array
		int totalPrice = 0;
		int priceOfParticularCompany = 0;
		for(Product p : prods) {
			System.out.println(p);
			totalPrice += p.getPrice();
			System.out.println(totalPrice);
			if(p.getCompany().equalsIgnoreCase("dell")) {
				priceOfParticularCompany += p.getPrice();
				System.out.println("Price of Dell : "+priceOfParticularCompany);
			}
		}
	}
}
