import java.util.HashMap;
import java.util.Map;

public class hashmaptraverse1 {
     public static void main(String[] args){
        HashMap <Integer,String>students=new HashMap<>();
        students.put(101,"Arun");
        students.put(102,"Bala");
        students.put(103,"kumar");
        for(int key:students.keySet()){
            System.out.println(key);
        }
        for(String name:students.values()){
            System.out.println(name);
        }
        for(var entry:students.entrySet()){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
        for(Map.Entry<Integer,String> entry:students.entrySet()){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
