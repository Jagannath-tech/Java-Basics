package string;
import java.util.Scanner;
public class removenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String c="";
		char b[]=a.toCharArray();
		for(int i=0;i<a.length();i++) {
			if(!Character.isDigit(b[i])) {
				c+=b[i];
			}
		}
		System.out.println(c);
	}

}

