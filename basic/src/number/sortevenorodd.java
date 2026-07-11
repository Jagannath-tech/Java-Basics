package number;
import java.util.Scanner;
public class sortevenorodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int b[]=new int[size];
		int i,j,k=0;
		for( i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			
		}
		for( j=0;j<size;j++) {
			if(arr[j]%2==0) {
				b[k]=arr[j];
				k++;
			}
		   }
		for(j=0;j<size;j++) {
			if((arr[j]%2)!=0) {
				b[k]=arr[j];
				k++;
			}
		}
				
		for(int l=0;l<size;l++) {
			System.out.println(b[l]);
		}
		
	}

}
