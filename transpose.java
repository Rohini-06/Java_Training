import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();   
        int c = sc.nextInt();
        int[][] m = new int[r][c];
        int[][] t = new int[c][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                t[j][i] = m[i][j];
            }
        }

        System.out.println("Transpose:");

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }

    }
}