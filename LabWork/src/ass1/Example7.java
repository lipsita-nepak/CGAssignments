package ass1;

import java.util.Scanner;

public class Example7 {
	
	boolean checkNumber(int n) {
		while(n>0) {
		int rem1=n%10;
		n=n/10;
		int rem2=n%10;
		n=n/10;
		if(rem1>=rem2)
			continue;
		else
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		
		Example7 ex=new Example7();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no:");
		int n=sc.nextInt();
		if(ex.checkNumber(n))
			System.out.println(" It is an increasing number");
		else
			System.out.println(" It is not an increasing number");
		
       sc.close();
	}

}
