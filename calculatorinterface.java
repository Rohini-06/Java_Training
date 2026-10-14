import java.util.Scanner;
interface Calculator{
    int calculate(int a,int b);
}
class Addition implements Calculator{
    public int calculate(int a,int b){
        return a+b;
    }
}
class Subtraction implements Calculator{
    public int calculate(int a,int b){
        return a-b;
    }
}
class Multiplication implements Calculator{
    public int calculate(int a,int b){
        return a*b;
    }
}
class Division implements Calculator{
    public int calculate(int a,int b){
        return a/b;
    }
}


    public class calculatorinterface {
    public static void main(String[] args){
        Addition add=new Addition();
        Subtraction sub=new Subtraction();
        Multiplication mul=new Multiplication();
        Division div=new Division();
        System.out.println(add.calculate(10,20));
        System.out.println(sub.calculate(100,20));
        System.out.println(mul.calculate(80,20));
        System.out.println(div.calculate(1000,20));
    }
}
