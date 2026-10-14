import java.util.*;

public class streams1 {
    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(35, 55, 46, 75, 80);

        marks.stream()
             .filter(mark -> mark%2==0)
             .forEach(mark -> System.out.println(mark));
    }
}
