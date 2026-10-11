import java.util.ArrayList;
import java.util.Scanner;

public class rrotatearrlist2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> marks = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            marks.add(sc.nextInt());
        }

        int last = marks.remove(n - 1);
        marks.add(0, last);

        System.out.println(marks);
    }
}


