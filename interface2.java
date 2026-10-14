import java.util.*;
interface greeting{
    void sayHello();
}
class C implements greeting{
    public void sayBye(){
        System.out.println("Bye");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
}
public class interface2 {
    public static void main(String[] args){
        C greet=new C();
        greet.sayHello();
        greet.sayBye();
    }
}
