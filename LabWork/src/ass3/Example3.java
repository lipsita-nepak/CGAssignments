package ass3;

public class Example3 {

	String alterString(String s) {
	    String s1="";
		for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='I'||s.charAt(i)=='E'||s.charAt(i)=='O'||s.charAt(i)=='U') {
			s1+=s.charAt(i);
		}
		else
			s1+=(char)(s.charAt(i)+1);
		}
		return s1;
	}
	public static void main(String[] args) {
		
		Example3 ex=new Example3();
		//String s1="JAVA";
		System.out.println(ex.alterString("JAVA"));
		

	}

}
