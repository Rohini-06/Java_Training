import java.util.HashMap;

public class hashmapfun {
     public static void main(String[] args){
        HashMap <Integer,String>students=new HashMap<>();
        students.put(101,"Arun");
        students.put(102,"Bala");
        students.put(103,"kumar");
        System.out.println(students.get(102));
        students.put(102,"Barath");
        System.out.println(students.get(102));
        students.remove(103);
        System.out.println(students.containsKey(101));
         System.out.println(students.containsValue("Arun"));
        System.out.println(students.size());
        System.out.println(students.get(105));
        System.out.println(students.getOrDefault(105,"Not found"));

    }
}
