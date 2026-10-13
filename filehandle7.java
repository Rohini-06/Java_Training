import java.util.*;
import java.io.*;

public class filehandle7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 
        try (FileWriter writer = new FileWriter("Students.txt", true)) {
            for (int i = 0; i < n; i++) {
                String name = sc.nextLine();
                writer.write(name + "\n");
            }
            System.out.println("Written Successfully");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}