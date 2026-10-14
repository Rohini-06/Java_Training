import java.util.*;

public class streams5{
    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(95,80,26,85, 55, 26, 95, 80);

        marks.stream()
             .distinct()
             .forEach(mark -> System.out.println(mark));
    }
}
