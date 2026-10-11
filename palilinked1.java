import java.util.*;

public class palilinked1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> marks = new LinkedList<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            marks.add(sc.nextInt());
        }
        boolean pali = true;
        for (int i = 0; i < marks.size() / 2; i++) {
            int a=marks.get(i);
            int b=marks.get(marks.size()-1-i);
            if (!(a==b)){
                pali = false;
                break;
            }
        }

        System.out.print(pali ? "Palindrome" : "Not Palindrome");
    }
}

