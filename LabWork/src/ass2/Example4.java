package ass2;



public class Example4 {
	
	int[] modifyArray(int[] a) {
		
		for(int i=0;i<a.length-1;i++) {
		for(int j=0;j<a.length-1-i;j++) {
			if(a[j]<a[j+1])
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
		int[] temp=new int[a.length];
		int j=0;
		for(int i=0;i<a.length-1;i++) {
				if(a[i]!=a[i+1]) {
					temp[j++]=a[i];
				}
		}
		
		temp[j++]=a[a.length-1];
		
		int[] a1=new int[j];
	     for(int i=0; i<a1.length;i++)
		{
			a1[i]=temp[i];
		}
	   return a1;
	}

	public static void main(String[] args) {
		
		Example4 ex=new Example4();
		int[] a= {6,9,4,8,9,6,7};
		int[] resultArray=ex.modifyArray(a);
		for(int n:resultArray) {
			System.out.print(n+"\t");
		}
	}
}
