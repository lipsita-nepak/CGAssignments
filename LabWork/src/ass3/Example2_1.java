package ass3;

public class Example2_1 {
	
	void getReverse(StringBuffer sb) {
		StringBuffer sb1=new StringBuffer();
		sb1.append(sb);
		sb1.append("|");
		sb1.append(sb.reverse());
		System.out.println(sb1);
		
	}

	public static void main(String[] args) {
		
		Example2_1 ex=new Example2_1();
		StringBuffer sb=new StringBuffer("Hello");
		StringBuffer sb1=new StringBuffer("Earth");
		ex.getReverse(sb);
		ex.getReverse(sb1);
		

	}

}
