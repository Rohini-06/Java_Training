import java.util.*;
public class exception7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr={20,30,40,10};
        try{
            System.out.println(arr[2]);
            
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Program completed");
        }
        
    }
}
