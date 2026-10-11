import java.util.Scanner;
import java.util.LinkedList;
public class largestelell {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> marks=new LinkedList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            marks.add(sc.nextInt());
        }
        int large=marks.get(0);
        for(int i=1;i<marks.size();i++){
            if(marks.get(i)>large){
                large=marks.get(i);
            }
        }
        System.out.println(large);
}
}
