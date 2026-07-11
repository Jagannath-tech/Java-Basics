package string;
import java.util.Scanner;

public class vowelremove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b="";
		for(int i=0;i<a.length();i++) {
			char d=a.charAt(i);
			if(d!='a'&&d!='e'&&d!='i'&&d!='o'&&d!='u') {
				b+=d;
			}
		}
		System.out.println(b);
	}
}
