package ass4;

public class CurrentAccount extends Account {

	private double overDraft=0;
	/*public double getOverDraft() {
		return overDraft;
	}
	public void setOverDraft(double overDraft) {
		this.overDraft = overDraft;
	}*/
	CurrentAccount(){}
	CurrentAccount(Person accHolder,long accNum, double balance,double overDraft){
		super(accHolder,accNum,balance);
		this.overDraft=overDraft;
	}
	
	void withdraw(double amt) {
		if(this.getBalance()+overDraft-amt<=0)
		   System.out.println("over draft limit is reached");
		else
			System.out.println("over draft limit is not reached ");
	}
}
