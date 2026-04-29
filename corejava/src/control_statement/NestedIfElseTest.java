package control_statement;

import java.util.Scanner;

public class NestedIfElseTest {
	public static void main(String[] args) {
//		Voter Eligibility
//		Scanner scn=new Scanner(System.in);
//		System.out.print("Enter you nationality: ");
//		String citizen = scn.next();
//		System.out.println("Do you have your voter id:");
//		String hvVoteId = scn.next();
//		int age = 48;
//			if ( citizen.equalsIgnoreCase("Nepali")) {
//				if ( age>=18) {
//					
//					if(hvVoteId.equalsIgnoreCase("y")) {
//						System.out.println("You are eligible to vote");
//					}else {
//						System.out.println("You must have your voter id to be elegible to vote.");
//					}
//				}else {
//					System.out.println("You aren't eligible to vote");
//				}
//			}else {
//				System.out.println("Only Nepali Citizen can vote");
//			}
		
//		Grade Calculator based on marks of the students:
		int marks = 49;
		
		if (marks>=90) {
			System.out.println("Grade: A+");
		}else if(marks>=80) {
			System.out.println("Grade: A");
		}else if(marks>=70) {
			System.out.println("Grade: B+");
		}else if(marks>=60) {
			System.out.println("Grade: B");
		}else if(marks>=50) {
			System.out.println("Grade: C+");
		}else if(marks>=40) {
			System.out.println("Grade: C");
		}else if(marks>=30) {
			System.out.println("Grade: D+");
		}else {
			System.out.println("Grade: E");
		}
	}
}
