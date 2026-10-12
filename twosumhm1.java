import java.util.HashMap;

public class twosumhm1 {
    public static void main(String[] args) {
         HashMap<Integer, Integer> map = new HashMap<>();
         int[] nums = {2,7,11,15};
         int target=26;
         for(int i=0;i<nums.length;i++){
            int temp=target-nums[i];
            if(map.containsKey(temp)){
               System.out.println(map.get(temp)+"and"+i);
               return ;
         }
         map.put(nums[i],i);
         }
        System.out.println("Not found");
}
         }


