package array;

public class CalculateTotalMarksAndPercentage {
	public static void main(String[] args) {
		String [] subject = new String [] {"Math","English","Nepali","Computer","Science"};
		int marks [] = {99,80,87,88,69};
		int total = 0;
		int percentage = 0;
		for(int i=0; i<subject.length; i++) {
			if(subject.length == marks.length) {
				total +=marks[i];
				percentage = total/5;
			}
		}
		
			// Print The Total Marks And Percentage
			System.out.println("Total Marks : "+total);
			System.out.println("Total Percentage : "+percentage);
	}
}
