import java.util.Scanner;
import java.util.LinkedList;
public class linkedlistreverse {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> marks=new LinkedList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            marks.add(sc.nextInt());
        }
        for(int i=marks.size()-1;i>=0;i--){
            System.out.println(marks.get(i)+"");
        }
    }
}