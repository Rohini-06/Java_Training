import java.util.Scanner;

public class exception13 {
    static void divide(int a,int b) throws ArithmeticException{
        try{
            System.out.println(a/b);
        }
        catch(Exception e){
            System.out.println("cannot / by 0");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        divide(10,0);
    }
}
