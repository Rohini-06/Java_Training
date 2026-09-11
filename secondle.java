import java.util.Scanner;

public class secondle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] elts = new int[n];
        for (int i = 0; i < n; i++) {
            elts[i] = sc.nextInt();
        }
        int max=elts[0];
    

        for (int i = 0; i < n; i++) {
            if (elts[i] >max) {
                 max=elts[i];
                 System.out.print(max+" ");
            } 
            
            }
        }

    }
