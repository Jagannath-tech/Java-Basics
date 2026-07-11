package array;
import java.util.Scanner;
public class duplicateremove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int[a];
		int temp[]=new int[a];
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
		}
		int k=0;
		
		for(int i=0;i<a;i++) {
			boolean duplicate=false;
			for(int j=0;j<k;j++) {
				if(arr[i]==temp[j]) {
					duplicate=true;	
				}
			}
				if(!duplicate) {
					temp[k]=arr[i];
					k++;
				}
			}
			for(int l=0;l<k;l++) {
			System.out.print(temp[l]+" ");
		}
	
	}

}
