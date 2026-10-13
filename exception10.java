import java.util.Scanner;

public class exception10 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         try{
            System.out.println(10.0/0.0);
            
        }
         catch(ArithmeticException e){
            System.out.println("cannot divide by 0");
        }
    }
}
