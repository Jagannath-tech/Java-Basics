package star;

public class pascalpyramid {

    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            // Print leading spaces for alignment
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            int no = 1;
            for (int k = 0; k <= i; k++) {
                System.out.print(no + " ");
                no = no * (i - k) / (k + 1);
            }
            System.out.println();
        }
    }
}
