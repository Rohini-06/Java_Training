import java.util.Scanner;

public class secondlar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] elts = new int[n];
        for (int i = 0; i < n; i++) {
            elts[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (elts[i] > max) {
                secondMax = max;
                max = elts[i];
            } else if (elts[i] > secondMax && elts[i] != max) {
                secondMax = elts[i];
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("No second largest element exists.");
        } else {
            System.out.println(secondMax);
        }

        sc.close();
    }
}
