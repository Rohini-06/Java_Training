import java.util.*;
public class except3 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            int a=sc.nextInt();
            System.out.println(a);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Program completed");
    }

}
