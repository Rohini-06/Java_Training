import java.util.*;
public class java8features2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] marks=new int[n];
        for(int i=0;i<n;i++){
            marks[i]=sc.nextInt();
        }
        for(int num:marks){
            if(num<0){
                System.out.println(0);
            }
            else{
                 System.out.println(num);
            }
        }
       
    }
    
}
