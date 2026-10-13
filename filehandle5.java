import java.util.*;
import java.io.*;
public class filehandle5{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       File file=new File("Students.txt");
       try{
           file.createNewFile();
       }
       catch(Exception e){
        System.out.println(e.getMessage());
       }
       try(FileWriter writer=new FileWriter("Students.txt")){
        writer.write("Arun\n");
        writer.write("Barath\n");
        writer.write("Bala\n");
        System.out.println("Written Successfully");
       }
       catch(Exception e){
        System.out.println(e.getMessage());
       }
    }
}
