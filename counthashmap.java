import java.util.HashMap;

public class counthashmap {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int[] nums = {10, 20, 10, 30, 20, 10};

        for (int n : nums) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }

        System.out.println(map);
    }
}