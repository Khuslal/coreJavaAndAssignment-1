package control_statement;
import java.util.Scanner;
public class TotalSalaryCalc {
	public static void main(String[] args) {
		/*
		 * Q1>  WAP to calculate total salary of following post :
			 *   
			 *      post         basic salary      bonus   total salary 
			 *    ---------     --------------    -------  --------------
			 *    MD                 230000         20%         ?
			 *    CEO                250000         25.79%      ?
			 *    MANAGER            176000         16 %        ?
			 *    HELPER             145900         9%          ?
			 *  ---------------------------------------------------
		 */
		
		double MD = 230000;
		double CEO = 250000;
		double MANAGER = 176000;
		double HELPER = 145900;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Post of Employee: md, ceo, manager, helper ");
		String post = scn.next();
//		==================USING IF ELSE STATEMENT====================
		
//				
//		if (post.equalsIgnoreCase("md")) {
//			MD = MD+(MD*20/100);
//			System.out.println("MD Salary: "+ MD);
//		} else if (post.equalsIgnoreCase("ceo")) {
//			CEO = CEO+(CEO*25.79/100);
//			System.out.println("CEO Salary: "+ CEO);
//		}else if (post.equalsIgnoreCase("manager")) {
//			MANAGER = MANAGER+(MANAGER*16/100);
//			System.out.println("MANAGER Salary: "+ MANAGER);
//		}else if (post.equalsIgnoreCase("helper")) {
//			HELPER = HELPER+(HELPER*9/100);
//			System.out.println("HELPER Salary: "+ HELPER);
//		}
//		==============IF ELSE STATEMENT CLOSED=======================
		
//		----------------USING SWITCH STATEMENT---------------------
		switch (post) {
		case "md":
			MD = MD+(MD*20/100);
			System.out.println("MD Salary: "+ MD);
			break;
		case "ceo":
			CEO = CEO+(CEO*25.79/100);
			System.out.println("CEO Salary: "+ CEO);
			break;
		case "manager":
			MANAGER = MANAGER+(MANAGER*16/100);
			System.out.println("MANAGER Salary: "+ MANAGER);
			break;
		case "helper":
			HELPER = HELPER+(HELPER*9/100);
			System.out.println("HELPER Salary: "+ HELPER);
			break;
		default:
			System.out.println("Invalid Post, Check for case sensitive");
		}
//		------------------SWITCH STATEMENT CLOSED--------------------
	}
}
