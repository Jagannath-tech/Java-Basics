package basic;

public class functionparameters {
 static int  sum(int a[]) {
	 int b=a[a.length-1];
	 return b;
	 
 }
 
 public static void main (String [] args) {
	int a[]= {1,2,3,4};
	int j=sum(a);
	System.out.println(j);
	
	
 }
}
