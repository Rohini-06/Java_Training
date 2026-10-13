import java.util.*;
public class except2 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            int a=sc.nextInt();
            System.out.println(a);
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input");
        }
        System.out.println("Program completed");
    }

}
