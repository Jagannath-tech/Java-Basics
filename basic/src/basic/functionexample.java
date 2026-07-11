package basic;
import java.util.Scanner;
public class functionexample {
    void evenorodd(int number) {
    	
    	if(number%2==0) {
    		System.out.println("even");
    	}
    	else {
    		System.out.println("odd");
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
    	int num=sc.nextInt();
		functionexample obj1=new functionexample();
		obj1.evenorodd(num);
		sc.close();}

}
