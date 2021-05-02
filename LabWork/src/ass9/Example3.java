package ass9;

import java.util.Scanner;

interface intf2{
	boolean validate(String u_Name, String pwd);
}
public class Example3 {
	 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter username and password:");
		String u_name=sc.nextLine();
		String pwd=sc.nextLine();
        
		intf2 s=(userName,password)->{
			if(userName.equals("lipsita") && password.equals("lipsi"))
				return true;
			else
				return false;
		};
		System.out.println(s.validate(u_name, pwd));
		sc.close();
	};
}
