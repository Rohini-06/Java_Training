import java.util.Scanner;
interface Calculator{
    int calculate(int a,int b);
}
    public class funcinterface {
    public static void main(String[] args){
       Calculator add=(a,b)->(a+b);
        System.out.println(add.calculate(10,20));
    }
}
