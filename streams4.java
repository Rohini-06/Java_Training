import java.util.*;

public class streams4 {
    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(95,80,26,85, 55, 26, 95, 80);

        marks.stream()
             .limit(3)
             .forEach(mark -> System.out.println(mark));
    }
}
