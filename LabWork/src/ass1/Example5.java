package ass1;

import java.util.Scanner;

public class Example5 {

     int calculateSum(int n) {
		
		int sum=0;
		for(int i=0;i<=n;i++) {
			if(i%3==0 || i%5==0) {
				sum=sum+i;
			}
		}
		return sum;	
	}
	public static void main(String[] args) {
		
      Example5 ex=new Example5();
      Scanner sc=new Scanner(System.in);
      System.out.println("enter n:");
      int n=sc.nextInt();
      System.out.println("result:"+ex.calculateSum(n));
      
      sc.close();
	}

}
