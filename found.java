import java.util.Scanner;

public class found {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] elts = new int[n];
        for (int i = 0; i < n; i++) {
            elts[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            if (elts[i] == key) {
                
                System.out.print("Found");
                break;
            } else {
                System.out.println("Not found");
                break;
            }
        }

    }
}