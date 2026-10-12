import java.util.*;

public class iteratoreven {
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(10);
        nums.add(23);
        nums.add(30);
        Iterator <Integer>it =nums.iterator();
        while(it.hasNext()){
            int num=it.next();
            if(num % 2==0){
                it.remove();
            }
        }
         System.out.println(nums);
    }
}
