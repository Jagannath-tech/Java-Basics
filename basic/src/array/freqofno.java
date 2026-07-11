package array;
import java.util.Scanner;
public class freqofno {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
		}
		int b=sc.nextInt();
		int count=0;
		
		for(int i=0;i<a;i++) {
			
			
			int freq=1;
			for(int j=0;j<a;j++) {
				
				if(arr[i]==arr[j] && i!=j) {
					freq+=1;
				}
			}
			System.out.println("freq of"+arr[i]+"is "+freq);
			if(arr[i]==b) {
				count+=1;
			}
		}
		System.out.println(count);
		
	}

}
