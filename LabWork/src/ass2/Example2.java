package ass2;

public class Example2 {
	
	String[] sortStrings(String[] a) {
	    for(int i=0;i<a.length;i++) {
	    	
	    	for(int k=i+1;k<a.length;k++) {
	    		if(a[i].compareTo(a[k])>0) {
	    			String temp=a[i];
	    			a[i]=a[k];
	    			a[k]=temp;
	    			
	    		}
	    		
	    }}
	    
	    for(int i=0;i<a.length;i++) {
	    	if((a.length)%2==0) {
	    		for(int j=0;j<a.length/2;j++)
	    	        a[j]=a[j].toUpperCase();
	        }
	    	
	        else {
	    	    for(int j=0;j<(a.length/2)+1;j++)
	    		    a[j]=a[j].toUpperCase();
	        }
	      a[i]=a[i].toLowerCase();
	    }
	    return a;
	}

	public static void main(String[] args) {
		
         Example2 ex=new Example2();
         String[] s1= {"grapes","pineapple","orange","apple","strawberry","banana"};
         String[] s2= {"Rick","Steve","Abey","Lina","Chaitanya"};
         String[] s3= {"chennai","bhubaneswar","banglore","goa","mumbai","pune","gujarat","delhi","hyderabad"};
         String[] s4=ex.sortStrings(s1);
         String[] s5=ex.sortStrings(s2);
         String[] s6=ex.sortStrings(s3);
         for(String n:s4) {
        	 System.out.print(n+"\t");
         }
         System.out.println("\n");
         for(String n:s5) {
        	 System.out.print(n+"\t");
         }
         System.out.println("\n");
         for(String n:s6) {
        	 System.out.print(n+"\t");
         }
	}

}
