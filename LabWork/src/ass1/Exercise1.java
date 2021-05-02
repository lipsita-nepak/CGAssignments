package ass1;

import java.util.Scanner;

public class Exercise1 {
	
	int sumOfCubesOfDigits(int n) {
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum=sum+(int)Math.pow(rem,3);
			n=n/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		
		Exercise1 ex=new Exercise1();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no:");
		int n=sc.nextInt();
		System.out.println("sum="+ex.sumOfCubesOfDigits(n));
		
        sc.close();
	}

}
