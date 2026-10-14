import java.util.Scanner;
interface Calculator{
    int calculate(int a,int b);
}
class Addition implements Calculator{
    public int calculate(int a,int b){
        return a+b;
    }
}


    public class calcinterface {
    public static void main(String[] args){
        Calculator add=new Addition();
        System.out.println(add.calculate(10,20));
    }
}
