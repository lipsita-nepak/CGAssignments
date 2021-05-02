package ass3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Example1 {
	
	int stringTokenizerDemo(String s) {
		int sum=0;
		StringTokenizer st=new StringTokenizer(s, " ");
		while(st.hasMoreElements()) {
			
			String s1=st.nextToken();
			int n=Integer.parseInt(s1);
			System.out.print(s1+"\t");
			sum+=n;
		}
			
		return sum;
	}

	public static void main(String[] args) {
		
		Example1 ex=new Example1();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a line of integers with one gap space:");
		String s=sc.nextLine();
        System.out.println("\n sum of integers is:"+ex.stringTokenizerDemo(s));
        
        sc.close();
	}

}
