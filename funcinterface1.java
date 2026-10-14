import java.util.Scanner;
@FunctionalInterface 
interface Check{
    void oddoreven(int a);
}
    public class funcinterface1{
    public static void main(String[] args){
        Check c=(a)->{
        if (a %2==0){
            System.out.println ("even");
        } 
        else {
            System.out.println ("odd");
       }};
      c.oddoreven(10);
    }
}
