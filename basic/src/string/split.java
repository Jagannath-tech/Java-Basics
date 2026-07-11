package string;
import java.util.Scanner;
public class split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b[]=a.split(" ");
		for(String i:b) {
		System.out.println(i);
	}

	}
}
