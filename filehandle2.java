import java.util.*;
import java.io.*;
public class filehandle2{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       File file=new File("Students.txt");
       try{
        if(file.createNewFile()){
            System.out.print("File created");
        }
        else{
            System.out.print("Already exists");
        }
       }
       catch(Exception e){
        System.out.println(e.getMessage());
       }
    }
}
