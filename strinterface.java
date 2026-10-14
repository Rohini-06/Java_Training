import java.util.Scanner;
@FunctionalInterface 
interface Check{
    void more5(String a);
}
    public class strinterface{
    public static void main(String[] args){
        Check c=(a)->{
            int count=0;
            for(int i=0;i<a.length();i++){
                char s=a.charAt(i);
                count++;
            }
            if (count>5){
            System.out.println ("More than 5 Characters");
        } 
        else {
            System.out.println ("Less than 5 Characters");
       }};
      c.more5("Rohini");
    }
}