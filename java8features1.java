import java.util.*;
public class java8features1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] marks=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            marks[i]=sc.nextInt();
        }
        for(int num:marks){
            if(num>50){
                count++;
            }
        }
        System.out.println("count:"+count);
    }
    
}
