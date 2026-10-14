import java.util.*;

public class streams2 {
    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(35, 55, 46, 75, 80);

        marks.stream()
             .map(mark -> mark*2)
             .forEach(mark -> System.out.println(mark));
    }
}
