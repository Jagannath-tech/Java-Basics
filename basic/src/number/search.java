package number;
import java.util.Scanner;
public class search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			
			
		}
		boolean found=false;
		System.out.println("enter the variable to search");
		int b=sc.nextInt();
		for(int i=0;i<size;i++) {
			if(b==arr[i]) {
				 found=true;
				System.out.println(i);
			}
		}
		if(!found) {
			System.out.println("elements not found");
			
		}
	}

}
