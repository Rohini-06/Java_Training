import java.util.HashMap;
import java.util.Map;

public class mostfreqhm1 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] nums = {10, 20, 10, 30, 20, 10};
        int max = 0;
        int maxcount = 0;
        for (int n : nums) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxcount) {
                maxcount = entry.getValue();
                max = entry.getKey();
            }
        }

        System.out.println(max + " occurs " + maxcount + " times");
    }
}