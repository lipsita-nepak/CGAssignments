package ass4;

public class Example1 {

	public static void main(String[] args) {
		
		
		
		Person p1=new Person("Smith",23);
		Person p2=new Person("Kathy",24);
		
		
		Account a1=new SavingsAccount(p1,101010,2000.0);
		Account a2=new SavingsAccount(p2,201020,3000.0);
		
		a1.deposit(2000);
		a2.withdraw(2000);
		
		System.out.println(a1.getAccHolder().getName()+" balance is: "+a1.getBalance());
	    System.out.println(a2.getAccHolder().getName()+" balance is: "+a2.getBalance());
		
		a1.withdraw(4000);
		a2.withdraw(200);
		
		System.out.println(a1.getAccHolder().getName()+" balance is: "+a1.getBalance());
		System.out.println(a2.getAccHolder().getName()+" balance is: "+a2.getBalance());
		
		Account a3=new CurrentAccount(p1,101010,2000.0,1500.0);
		Account a4=new CurrentAccount(p2,201020,3000.0,2000.0);
		
		//a3.deposit(2000);
		//a4.withdraw(2000);
		
		//System.out.println(a3.getAccHolder().getName()+" balance is: "+a3.getBalance());
	    //System.out.println(a4.getAccHolder().getName()+" balance is: "+a4.getBalance());
		
		a3.withdraw(3500.0);
		a4.withdraw(7000.0);
		
		System.out.println(a3.getAccHolder().getName()+" balance is: "+a3.getBalance());
		System.out.println(a4.getAccHolder().getName()+" balance is: "+a4.getBalance());
		
		
	}

}
