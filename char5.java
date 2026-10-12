import java.util.*;

public class char5 {
    public static void main(String[] args) {
        ArrayList<String> nums=new ArrayList<>();
        nums.add("Java");
        nums.add("Python");
        nums.add("C");
        nums.add("HTML");
        nums.add("Kotlin");
        Iterator <String>it =nums.iterator();
        while(it.hasNext()){
           String num=it.next();
            if(num.length()<5){
                it.remove();
            }
        }
         System.out.println(nums);
    }
}
