package number;
import java.util.Scanner;
public class fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=0;
		int c=1;
		int result=0;
		System.out.print(b+" "+c+" ");
		for(int i=2;i<a;i++) {
			result=b+c;
			b=c;
			c=result;
			
			System.out.print(result+" ");
		}
	}

}
