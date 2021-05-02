package ass4;

public class Account {

	private long accNum;
	private double balance;
	
	private Person accHolder;
	
	Account(){}
	
	Account(Person accHolder,long accNum, double balance){
		this.accHolder=accHolder;
		this.accNum=accNum;
		this.balance=balance;
	}
	
	void deposit(double amt) {
		//this.setBalance(this.getBalance() + amt);
		balance+=amt;
	}
	
	void withdraw(double amt) {
		//this.setBalance(this.getBalance() - amt);
		balance-=amt;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	 public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}

	
	
	
	
}
