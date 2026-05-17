package methodoverriding;

public class NBMBank extends CentralBank {

	@Override
	void getBankName() {
		System.out.println("NBM Bank");
	}

	@Override
	void getInterestRate() {
		System.out.println("17%");
	}
}
