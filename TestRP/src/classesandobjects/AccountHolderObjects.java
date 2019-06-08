package classesandobjects;

public class AccountHolderObjects {

	public static void main(String[] args) {
		
	
	AccountHolder tom = new AccountHolder();
	AccountHolder henry = new AccountHolder();
	AccountHolder sarah = new AccountHolder();
	
	tom.firstName = "Tom";
	tom.lastName = "Dick";
	tom.age = 20;
	tom.salary = 15000;
	
	System.out.println("Tom's eligibility for a CC : " + tom.creditcardeligibility);
	}
}
