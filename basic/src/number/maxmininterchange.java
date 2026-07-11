package number;

import java.util.Scanner;
import java.util.Arrays;

public class maxmininterchange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size");
        int a = sc.nextInt();
        int[] arr = new int[a];
        int[] dup = new int[a];

        // Input
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort so we can pick max/min correctly
        Arrays.sort(arr);

        int start = 0;
        int end = a - 1;

        // Use your outer loop structure
        for (int i = 0; i < a; i++) {
            if (i % 2 == 0) {
                dup[i] = arr[end--]; // even index: pick max
            } else {
                dup[i] = arr[start++]; // odd index: pick min
            }
        }

        // Output
        for (int i = 0; i < a; i++) {
            System.out.println(dup[i]);
        }

        sc.close();
    }
}
