package string;
import java.util.Scanner;
public class palindromeusingstringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		StringBuilder sb=new StringBuilder(a);
		sb.reverse();
		String b=new String(sb);
		if(b.equals(a)) {
			System.out.println("palindrome");
			
		}
		else {
			System.out.println("not a palindrome");
		}

	}

}
