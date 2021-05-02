package ass3;

import java.util.Scanner;

public class Example5 {
	
	void getCount(String s) {
		int countCharacters=s.length();
		int countLines=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='\n')
				countLines++;
		}
		String[] words=s.split(" ");
		int countWords=words.length;
		
		System.out.print("\n no.of characters:"+countCharacters);
		System.out.print("\n no.of lines:"+countLines);
		System.out.print("\n no.of words:"+countWords);
		
	}

	public static void main(String[] args) {
		
		Example5 ex=new Example5();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter text:");
		String s=sc.nextLine();
		ex.getCount(s);
		
		sc.close();

	}

}
