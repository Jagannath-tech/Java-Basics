package number;
import java.util.Scanner;
//import java.util.Arrays; for inbuit fn
public class sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<a;i++) {
			for(int j=0;j<a-1-i;j++) {		//bubble sort
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
			
		}
		for(int i:arr) {
			System.out.println(i);
		}
		//Arrays.sort(arr); using in built
	}

}
