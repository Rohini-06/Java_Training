import java.util.Scanner;

public class prt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= n; c++) {
                if (r + c == n || r + c == n + 2) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}