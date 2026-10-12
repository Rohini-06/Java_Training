import java.util.HashMap;

public class hashmaptraverse {
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
    }
}
