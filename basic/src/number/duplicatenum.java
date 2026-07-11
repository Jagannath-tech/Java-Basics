package number;
import java.util.Scanner;
public class duplicatenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]= {3,4,1,2,2,3};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				}
				}
				
				}
		int k=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				a[k]=a[i];
				k++;
		}
		}
		a[k++]=a[a.length-1];
						for(int l=0;l<k;l++) {
				
					System.out.println(a[l]);
			}
			
		}}
	


