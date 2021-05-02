package ass3;

public class Example4 {
	
	int modifyNumber(int n) {
		StringBuffer sb1=new StringBuffer();
		int diff=0;
		String s=String.valueOf(n);
		for(int i=0;i<s.length()-1;i++) {
			int n1=s.charAt(i);
			int n2=s.charAt(i+1);
			diff=Math.abs(n1-n2);
			sb1.append(diff);
		}
		sb1.append(s.charAt(s.length()-1));
		int result=Integer.parseInt(sb1.toString());
		return result;
		
		
	}

	public static void main(String[] args) {
		
		Example4 ex=new Example4();
		System.out.println(ex.modifyNumber(45862));
		

	}

}
