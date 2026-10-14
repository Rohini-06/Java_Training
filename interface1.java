import java.util.*;
interface greeting{
    void sayHello();
}
class C implements greeting{
    public void sayHello(){
        System.out.println("Hello");
    }
}
public class interface1 {
    public static void main(String[] args){
        C greet=new C();
        greet.sayHello();
    }
}
