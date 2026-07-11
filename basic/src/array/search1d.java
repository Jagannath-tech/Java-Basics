package array;
import java.util.Scanner;
public class search1d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int a=sc.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter variable to search");
		int b=sc.nextInt();
		for(int i=0;i<a;i++) {
			if(b==arr[i]) {
				System.out.println("element found at index: "+i);
			}
		}
	}

}
