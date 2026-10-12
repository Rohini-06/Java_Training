import java.util.HashMap;
import java.util.Scanner;
public class charhashmap {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        } 
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.get(ch)==1){
                System.out.println(ch);
                return ;
            }
        }
        System.out.println("Repeated");
}
}
