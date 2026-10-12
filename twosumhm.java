import java.util.HashMap;
import java.util.Scanner;

public class twosumhm {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        int n=sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int t=sc.nextInt();
         for(int i=0;i<n;i++){
            int c=t-nums[i];
            if(map.containsKey(c)){
            System.out.println(map.get(c)+"and"+i);
            return ;
         }
         map.put(nums[i],i);
         }
        System.out.println("Not found");
}
}
