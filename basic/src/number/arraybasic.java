package number;
import java.util.Scanner;
public class arraybasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		int max=arr[0];
		int min=arr[0];
		
		for(int i=0;i<a;i++) {
			sum+=arr[i];
			max=Math.max(arr[i],max);
			min=Math.min(arr[i], min);

		}
		double avg=(double) sum/a;
		System.out.println(sum);
		System.out.println(max);
		System.out.println(min);
		System.out.println(avg);

		
		
		
		
		
	}

}
