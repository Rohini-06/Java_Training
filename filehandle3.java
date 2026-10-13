import java.util.*;
import java.io.*;
public class filehandle3{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       File file=new File("Students.txt");
       try{
           file.createNewFile();
       }
       catch(Exception e){
        System.out.println(e.getMessage());
       }
       System.out.println(file.getName());
       System.out.println(file.length());
       System.out.println(file.exists());
       file.delete();
       System.out.println(file.exists());
    }
}
