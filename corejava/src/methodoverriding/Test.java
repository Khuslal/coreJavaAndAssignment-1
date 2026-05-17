package methodoverriding;

public class Test {
	public static void main(String[] args) {

		// static or early binding of object
		NabilBank nb = new NabilBank();
		nb.getBankName();
		nb.getInterestRate();

		// up-casting
		CentralBank bank = new PrabhuBank();
		bank.getBankName();
		bank.getInterestRate();

		CentralBank bank1 = new NBMBank();
		bank1.getBankName();
		bank1.getInterestRate();
		
		CentralBank bank2 = new NabilBank();
//		bank2.getBankName();
//		bank2.getInterestRate();
		
		// Using Late / Dynamic Binding Method:
		Test demo = new Test();
		demo.printBankInfo(bank);
		demo.printBankInfo(bank2);
		

	}

	// late or dynamic binding of object
	// runtime polymorphism
	void printBankInfo(CentralBank bank) {
		bank.getBankName();
		bank.getInterestRate();
	}

}
