import java.util.*;

public class 5char {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(
            Arrays.asList("java", "python", "c", "html", "kotlin")
        );

        list.removeIf(s -> s.length() < 5);

        System.out.println(list);
    }
}