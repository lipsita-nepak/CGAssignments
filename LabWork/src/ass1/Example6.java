package ass1;

import java.util.Scanner;

public class Example6 {
	
	int calculateDifference(int n) {
		
		int sum1=0;
		int sum2=0;
		for(int i=1;i<=n;i++) {
			sum1=sum1+(i*i);
			sum2=sum2+i;
		}
		
		int diff=sum1-(sum2*sum2);
		return diff;
	}

	public static void main(String[] args) {
		
     Example6 ex=new Example6();
     Scanner sc=new Scanner(System.in);
     System.out.println("enter n:");
     int n=sc.nextInt();
     System.out.println("result:"+ex.calculateDifference(n));
     
     sc.close();
	}

}
