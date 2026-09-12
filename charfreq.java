import java.util.Scanner;

public class charfreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int ch = 0;
        char maxchar = ' ';

        for (int i = 0; i < str.length(); i++) {
            int c = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    c++;
                }
            }

            if (c > ch) {
                ch = c;
                maxchar = str.charAt(i);
            }
        }

        System.out.println(maxchar + "-" + ch);
    }
}