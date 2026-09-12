import java.util.Scanner;

public class CheckIdentityMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] m= new int[n][n];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        boolean identity = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == j && m[i][j] != 1) {
                    identity = false;
                }

                if (i != j && m[i][j] != 0) {
                    identity = false;
                }
            }
        }

        if (identity)
            System.out.println("Identity Matrix");
        else
            System.out.println("Not an Identity Matrix");

    }
}