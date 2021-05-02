package ass4;

public class SavingsAccount extends Account {

	final double minBalance=500;
	
	SavingsAccount(){}
	SavingsAccount(Person accHolder,long accNum, double balance){
		super(accHolder,accNum,balance);
		}
		void withdraw(double amt) {
			
		if(this.getBalance()-amt>minBalance) {
			this.setBalance(this.getBalance() - amt);
		}
		else
			System.out.println("min balance 500 to be maintained");
			
		
	}
	
}
