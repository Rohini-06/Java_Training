import java.util.Scanner;
interface Calculator{
    int calculate(int a,int b);
}
    public class maxinterface {
    public static void main(String[] args){
       Calculator max=(a,b)->{
        if (a>b) return a;
        else return b;
       };
        System.out.println(max.calculate(10,20));
    }
}
