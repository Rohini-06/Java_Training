import java.util.*;

public class removetargetit {
     public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(10);
        nums.add(40);
        nums.add(50);
        nums.add(10);
        int target=10;
        Iterator <Integer>it =nums.iterator();
        while(it.hasNext()){
            int num=it.next();
            if(num ==target){
                it.remove();
            }
        }
         System.out.println(nums);
    }
}
