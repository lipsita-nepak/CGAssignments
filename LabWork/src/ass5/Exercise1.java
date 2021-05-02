package ass5;

import java.util.Scanner;

public class Exercise1 {
	
	static void getAge(int age)throws InvalidAgeException {
		if(age<15)
			throw new InvalidAgeException("Age Should be Above 15 ");
		else
			System.out.println("Age is:"+age);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age:");
		int age=sc.nextInt();
		try {
			getAge(age);
		}
		catch( InvalidAgeException e) {
			e.printStackTrace();
		}
		sc.close();

	}

}
