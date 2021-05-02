package ass3;

public class Example2 {
	
	String getImage(String s) {
	String s1="";
	for(int i=s.length()-1;i>=0;i--) {
		s1+=s.charAt(i);
	}
	   return s1;
	 }
   

	public static void main(String[] args) {
		
		Example2 ex=new Example2();
		
		String s1="hello";
		System.out.println(s1+"|"+ex.getImage(s1));
				

	}

}
