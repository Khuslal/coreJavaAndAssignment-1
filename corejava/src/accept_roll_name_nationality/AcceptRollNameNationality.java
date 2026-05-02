package accept_roll_name_nationality;

import java.util.Scanner;

public class AcceptRollNameNationality {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter Name : ");
		String name = scn.nextLine();
		
		System.out.print("Enter Roll no. : ");
		int rollno = scn.nextInt();
		
		System.out.print("Enter Nationality : ");
		String nationality = scn.next();
		
		System.out.println("Name : "+name+"\nRoll no. : "+rollno+"\nNationality : "+nationality);
		
		scn.close();
	}
}
