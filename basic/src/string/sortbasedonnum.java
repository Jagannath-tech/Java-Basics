package string;
import java.util.Scanner;
public class sortbasedonnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b[]=a.split(" ");
		String g[]=new String[b.length];
		for(int i=0;i<b.length;i++) {
			char c[]=b[i].toCharArray();
			for(int j=0;j<c.length;j++) {
				if(Character.isDigit(c[j])) {
					int no=c[j]-'0';
					g[no]=b[i];
				}
				
			}
		}
		String f="";
		for(int i=0;i<g.length;i++) {
			char d[]=g[i].toCharArray();
			for(int j=0;j<d.length;j++) {
				if(!Character.isDigit(d[j])) {
					f+=d[j];
					
				}
			}
			f+=" ";
		}
		System.out.println(f);
	}

}
