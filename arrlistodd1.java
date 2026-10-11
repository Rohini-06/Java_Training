import java.util.Scanner;
import java.util.ArrayList;

public class arrlistodd1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> marks=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            int mark=sc.nextInt();
            marks.add(mark);
        }
        for(int i=0;i<marks.size();i++){
            int mark=marks.get(i);
            if(mark%2==0){
                marks.remove(i);
                i--;
            }
        }
        System.out.println(marks);

    }
}
