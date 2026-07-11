package star;
import java.util.Scanner;
public class diamond {

	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	        int n = sc.nextInt(); // Height of the top half of the diamond

	        // Top half
	        for (int i = 1; i <= n; i++) {
	            // Print spaces
	            for (int j = i; j < n; j++) {
	                System.out.print(" ");
	            }

	            // Print stars
	            for (int j = 1; j <= (2 * i - 1); j++) {
	                System.out.print("*");
	            }

	            System.out.println();
	        }

	        // Bottom half
	        for (int i = n - 1; i >= 1; i--) {
	            // Print spaces
	            for (int j = n; j > i; j--) {
	                System.out.print(" ");
	            }

	            // Print stars
	            for (int j = 1; j <= (2 * i - 1); j++) {
	                System.out.print("*");
	            }

	            System.out.println();
	        }
	    }
	}
