package number;
import java.util.Scanner;
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter your"+size+"variables");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			
	}for(int j=0;j<size;j++) {
		System.out.println(arr[j]);
	}
	}
}
