import java.util.*;
interface greeting{
    void sayHello();
    default void sayBye(){
        System.out.print("Bye");
    }
    static void Welcome(){
        System.out.println("Welcome");
    }
}
class C implements greeting{
    public void sayHello(){
        System.out.println("Hello");
    }
}
public class interface6{
    public static void main(String[] args){
        C greet=new C();
        greet.sayHello();
        greet.sayBye();
        greeting.Welcome();
        greet.Welcome();
        
    }
}
