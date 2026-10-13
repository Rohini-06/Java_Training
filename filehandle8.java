import java.util.*;
import java.io.*;
public class filehandle8{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       File file=new File("Students.txt");
       try{
           file.createNewFile();
       }
       catch(Exception e){
        System.out.println(e.getMessage());
       }
      try(BufferedReader reader=new BufferedReader(new FileReader("students.txt"))){
        String line;
        while((line=reader.readLine())!=null){
            System.out.println(line);
        }
      }
      catch(Exception e){
        System.out.println(e.getMessage());
      }
    }
}
