import java.util.*;
public class exception14 {
    public static void main(String[] args) throws IllegalAccessException {
        Scanner sc=new Scanner(System.in);
        try{
        int age=sc.nextInt();
        if(age<0){
            throw new IllegalArgumentException("Negative age");
        }
        else if(age>100){
            throw new IllegalArgumentException("Age above 100");
        }
        System.out.print(age);
    }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
