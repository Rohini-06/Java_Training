import java.util.*;

public class rrotatearrlist1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> marks = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            marks.add(sc.nextInt());
        }

        marks.add(0, marks.get(n - 1));
        marks.remove(n);

        System.out.println(marks);
    }
}