import java.util.*;
public class exception8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr={20,30,40,10};
        int index=sc.nextInt();
        int num=sc.nextInt();
        try{
            System.out.println(arr[index]/num);
            
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index");
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by 0");
        }
        finally{
            System.out.println("Program completed");
        }
        
    }
}
