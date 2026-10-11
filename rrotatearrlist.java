import java.util.Scanner;
import java.util.ArrayList;
public class rrotatearrlist {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> marks=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            int mark=sc.nextInt();
            marks.add(mark);
        }
        int last=marks.get(marks.size()-1);
        for(int i=marks.size()-1;i>0;i--){
             marks.set(i,marks.get(i-1));
      }
        marks.set(0,last);
        for(int i=0;i<marks.size();i++){
            System.out.println(marks.get(i)+" ");
       }

    }
}
