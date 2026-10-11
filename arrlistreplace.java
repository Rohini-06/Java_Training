import java.util.Scanner;
import java.util.ArrayList;

public class arrlistreplace {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> marks=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            int mark=sc.nextInt();
            if(mark<0){
                mark=0;
            }
            marks.add(mark);
        }
        System.out.println(marks);

    }
}
