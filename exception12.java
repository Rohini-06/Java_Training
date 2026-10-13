import java.util.*;
public class exception12 {
    public static void main(String[] args) throws IllegalArgumentException{
        Scanner sc=new Scanner(System.in);
        int age=15;
        if(age<18){
            throw new IllegalArgumentException("Age must be above 18");
        }
        System.out.print("Eligible");
    }
}
