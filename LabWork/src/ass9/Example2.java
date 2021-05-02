package ass9;

interface intf1{
	void stringFormat(String s);
}
public class Example2 {
	static String s2="";
	public static void main(String[] args) {
		
        intf1 s1=s->{for(int i=0;i<s.length();i++) {
        	s2+=s.charAt(i)+" ";
        	}
        System.out.println(s2);
        };
        s1.stringFormat("lipsita");
        	
        
	}

}
