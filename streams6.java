import java.util.*;

public class streams6 {
    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(95,80,26,85, 55, 26, 95, 80);

        long total=marks.stream().count();
        System.out.println(total);
             
    }
}
