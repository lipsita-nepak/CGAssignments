package ass1;

import java.util.Scanner;

public class Exercise2 {
	
	void selectLight(String choice) {
		switch(choice) {
		
		case "red": {
			System.out.println("STOP!!!");
			break;
		}
		case "green":{
			System.out.println("GO!!!");
			break;
		}
		case "orange":{
			System.out.println("READY!!!");
			break;
		}
		default:System.out.println("INVALID!!!");
		            
		            
		}
	}

	public static void main(String[] args) {
		
		Exercise2 ex=new Exercise2();
		Scanner sc=new Scanner(System.in);
	    System.out.println("\t o RED \n\t o GREEN \n\t o ORANGE\n");
		String ch=sc.next();
		ex.selectLight(ch);
		
		sc.close();
		
		
		

	}

}
