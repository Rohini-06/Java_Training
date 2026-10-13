import java.util.*;
import java.io.*;
public class filehandle6{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       File file=new File("Students.txt");
    
       try(FileWriter writer=new FileWriter("Students.txt",true)){
        writer.write("Arun1\n");
        writer.write("Barath2\n");
        writer.write("Bala3\n");
        System.out.println("Written Successfully");
       }
       catch(Exception e){
        System.out.println(e.getMessage());
       }
    }
}
