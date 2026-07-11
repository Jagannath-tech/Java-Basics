package number;
import java.util.Scanner;
public class fractionadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int d1=sc.nextInt();
		int n2=sc.nextInt();
		int d2=sc.nextInt();
		int dresult=d1*d2;
		int num1=d2*n1;
		int num2=d1*n2;
		int nresult=num1+num2;
		int nres=nresult;
		int dres=dresult;
		for(int i=dresult;i>0;i--) {
			if(nresult%i==0&&dresult%i==0) {
				nres=nresult/i;
				dres=dresult/i;
				System.out.println(nres+"/"+dres);
				break;
			}
		}
	}
}