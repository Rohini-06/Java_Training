import java.util.Scanner;

public class floyd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= r; c++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}