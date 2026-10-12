import java.util.TreeMap;

public class treemap {
     public static void main(String[] args){
        TreeMap <Integer,String>students=new TreeMap<>();
        students.put(103,"Arun");
        students.put(110,"Bala");
        students.put(105,"kumar");
        students.put(120,"David");
        System.out.println(students.firstKey());
        System.out.println(students.lastKey());
        System.out.println(students.higherKey(105));
        System.out.println(students.lowerKey(105));
        System.out.println(students.floorKey(105));
        System.out.println(students.ceilingKey(105));
        System.out.println(students.descendingMap());
        
}
}