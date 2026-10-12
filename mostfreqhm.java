import java.util.HashMap;
import java.util.Scanner;

public class mostfreqhm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> count = new HashMap<>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            count.put(k, count.getOrDefault(k, 0) + 1);
        }
        int max=0,maxcount=0;
        for (int k : count.keySet()) {
            if(count.get(k)>maxcount){
                max=k;
                maxcount=count.get(k);

            }
           
        }
 System.out.println(max + "occurs" + maxcount+"times");
      
    }
}