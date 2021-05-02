package ass3;

import java.util.Scanner;

public class Example8 {

	boolean isPositive(String s) {
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)<s.charAt(i+1))
				continue;
			else
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		
        Example8 ex=new Example8();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string:");
        String s1=sc.next();
        String s2=s1.toUpperCase();
        if(ex.isPositive(s2))
        	System.out.println(s1+" is a positive string");
        else
        	System.out.println(s1+" is not a positive string");
        
        sc.close();
		
	}

}
