package volume_of_cylinder;

import java.util.Scanner;

public class VolumeOfCylinder {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		// Radius of Cylinder
		System.out.print("Enter the radius: ");
		int radius = scn.nextInt();
		
		// Height of Cylinder
		System.out.print("Enter the length: ");
		int length = scn.nextInt();
		
		// PI value declaration
		double pi = Math.PI;
		// Applying formula for volume of cylinder;
		double volume = pi*radius*radius*length;
		System.out.println("The volume of cylinder with radius :"+radius+" and height : "+length+" : "+volume);
	}
}
