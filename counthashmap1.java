import java.util.HashMap;
import java.util.Scanner;

public class counthashmap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Integer> count = new HashMap<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            count.put(k, count.getOrDefault(k, 0) + 1);
        }

        for (int k : count.keySet()) {
            System.out.println(k + "=" + count.get(k));
        }

        sc.close();
    }
}