package classesandobjects;

public class AccountHolder {
	
		String firstName;
		String lastName;
		int age =0;
		float salary = 0;
		boolean creditcardeligibility;
//	 String firstName;
		
		public void testElegibilityforCreditCard() {
		if (age>25 && salary >=20000)
			creditcardeligibility = true;
	}
	
}
