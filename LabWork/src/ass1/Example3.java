package ass1;

import java.util.Scanner;

public class Example3 {

	int fibonacciSeries(int n) {
		int a=0,b=1,c;
		for(int i=1;i<=n;i++) {
		    
			if(i==n) {
			return a;
			
			}
			c=a+b;
			a=b;
			b=c;
		}
		return 0;
	  }
	int fibonacciRecursive(int n) {
		if(n<=1)
			return n;
		return fibonacciRecursive(n-1)+fibonacciRecursive(n-2);
	}
	
	public static void main(String[] args) {
		
       Example3 ex=new Example3();
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the nth term:");
       int n=sc.nextInt();
       System.out.println(ex.fibonacciSeries(n));
       System.out.println("------------------------------------");
       System.out.println(ex.fibonacciRecursive(n-1));
    	
       sc.close();
	}

}
