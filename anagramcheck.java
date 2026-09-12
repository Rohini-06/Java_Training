import java.util.Scanner;

public class anagramcheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if (s1.length() != s2.length()) {
            System.out.print("Not Anagram");
            return;
        }
        int[] c = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            c[s1.charAt(i)]++;
            c[s2.charAt(i)]--;
        }
        for (int i = 0; i < 256; i++) {
            if (c[i] != 0) {
                System.out.print("Not Anagram");
                return;
            }
        }
        System.out.print("Anagram");
    }
}