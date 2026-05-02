package convertasciitocharacter;

import java.util.Scanner;

public class ConvertASCIIToCharacter {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the ascii number between 0 - 127 : ");
		int ascii = scn.nextInt();
		if(ascii >=0 && ascii <128) {
			char character = (char)ascii;
			
			System.out.println(character);
		}else {
			System.out.println("Invalid Command !");
		}
		scn.close();
	}
}
