package ass2;

public class Example3 {
	
	int[] getSorted(int[] a) {
		int[] arr1=new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			int rev=0;
			int n=a[i];
			while(n>0) {
				int rem=n%10;
				rev=rev*10+rem;
				n=n/10;
			}
			arr1[i]=rev;
		}
		for(int i=0;i<arr1.length-1;i++) {
			for(int j=0;j<arr1.length-1-i;j++) {
				if(arr1[j]>arr1[j+1]) {
					int temp=arr1[j];
					arr1[j]=arr1[j+1];
					arr1[j+1]=temp;
				}
			}
		}
		return arr1;
	}
	
	

	public static void main(String[] args) {
		
		Example3 ex=new Example3();
		int[] a= {123,776,458,298,675,110};
		int[] resultArray=ex.getSorted(a);
		for(int n:resultArray) {
			System.out.print(n+"\t");
			
		}
		

	}

}
