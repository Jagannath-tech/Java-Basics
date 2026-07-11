package number;
import java.util.Scanner;
public class perfectsq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int count=0;
		for(int i=1;i<a;i++) {
			if(a==i*i) {
				count++;
				break;
			}
			
		}
		if(count==1) {
			System.out.println("perfect square");
		}
		else {
			System.out.println("not a perfect square");
		}
	}

}
