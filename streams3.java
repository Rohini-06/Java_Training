import java.util.*;

public class streams3 {
    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(85, 55, 26, 95, 80);

        marks.stream()
             .sorted()
             .forEach(mark -> System.out.println(mark));
    }
}
