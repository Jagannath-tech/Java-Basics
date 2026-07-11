package string;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b=a;
        char c[]=b.toCharArray();
        
         for(int i=a.length()-1,k=0;i>0;i--) {
        	 c[k]=c[i];
        	k++;
         }
         String d=new String(c);
         
         
        System.out.println(b.equals(d));
    }
}

