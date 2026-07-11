package string;
import java.util.Scanner;

public class reversestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String a=sc.next();
       
    	   
    	   StringBuilder sb=new StringBuilder(a);
    	   sb.reverse();
    	   String b=new String(sb);
    	   System.out.println(b);
    	   
    	   
    	   char c[]=a.toCharArray();   //without StringBuilder
    	   char d[]=new char[a.length()];
    	   for(int i=a.length()-1,k=0;i>=0;i--,k++) {
    		   d[k]=c[i];
    	   }
    	   String e=new String(d);
    	   System.out.println(d);
       
    }
}