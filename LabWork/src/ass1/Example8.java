package ass1;

import java.util.Scanner;

public class Example8 {
	
	boolean checkNumber(int n) {
		while(n%2==0) {
			n=n/2;
		}
		if(n==1)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		
		Example8 ex=new Example8();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n:");
		int n=sc.nextInt();
		if(ex.checkNumber(n))
			System.out.println(n+" is a power of 2");
		else
			System.out.println(n+" is not a power of 2");

		sc.close();
	}

}
