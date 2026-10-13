import java.util.*;
public class exception6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr={20,30,40,10};
        try{
            System.out.println(arr[5]);
            
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Program completed");
        }
        
    }
}
