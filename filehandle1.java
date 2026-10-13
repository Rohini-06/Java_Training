import java.util.*;
import java.io.*;
public class filehandle1 {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       File file=new File("Students.txt");
       try{
        file.createNewFile();
       }
       catch(Exception e){
        System.out.println(e.getMessage());
       }
    }
}
