import java.util.*;
public class java8features3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] marks=new int[n];
        for(int i=0;i<n;i++){
            marks[i]=sc.nextInt();
        }
        for(int i=0;i<marks.length;i++){
            if(marks[i]<0){
                marks[i]=0;
            }
        }
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]+" ");
        }
       
    }
    
}
