package ass9;

@FunctionalInterface
interface intf{
	int power(int x,int y);
}
public class Example1 {
	
	public static void main(String[] args) {
		 
		intf r=(x,y)->{return (int) Math.pow(x,y);};
		System.out.println(r.power(3,3));
      
	}

}
