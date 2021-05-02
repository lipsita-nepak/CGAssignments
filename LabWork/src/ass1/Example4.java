package ass1;

public class Example4 {

	boolean flag;
	void isPrime(int n) {
		for(int i=1;i<=n;i++) {
			if(i<=2)
				continue;
			flag=true;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
				flag=false;
				break;
			}
		}
			if(flag)
				System.out.print(i+"\t");
	  }
	}
	public static void main(String[] args) {
	
		Example4 ex=new Example4();
		ex.isPrime(20);

	}

}
