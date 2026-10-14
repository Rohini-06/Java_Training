import java.util.*;
interface greeting{
    void sayHello();
}
class C implements greeting{
    public void sayBye(){
        System.out.println("Bye");
    }
    
}
public class interface5{
    public static void main(String[] args){
        C greet=new C();
        greet.sayBye();
        
    }
}
