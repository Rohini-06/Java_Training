import java.util.Scanner;
import java.util.LinkedList;
public class linkedlist {
    public static void main(String[] args){
        LinkedList<Integer> marks=new LinkedList<>();
        marks.add(10);
        marks.add(20);
        marks.add(30);
        marks.addFirst(5);
        marks.add(1,15);
        System.out.println(marks.getFirst());
        System.out.println(marks.getLast());
        System.out.println(marks.get(1));
        System.out.println(marks.removeFirst());
        System.out.println(marks.removeLast());
        System.out.println(marks.remove(1));
    }
}
