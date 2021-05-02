package ass2;

public class Example1 {
	
	int getSecondSmallest(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			
		}
		return a[1];
	}
	

	public static void main(String[] args) {
		
		Example1 ex1=new Example1();
		int[] a= {3,5,2,7,8,9,6};
		System.out.println("second smallest element:"+ex1.getSecondSmallest(a));
		

	}

}
