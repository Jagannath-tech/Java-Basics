package string;
import java.util.Scanner;
public class uppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b[]=a.split(" ");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length();j++)
			{
				System.out.print(Character.toUpperCase(b[j].charAt(0))+b[j].substring(1).toLowerCase());
			}
		}
		
	}

}
