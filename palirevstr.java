import java.util.Scanner;
public class palirevstr{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder rev=new StringBuilder("");
        for(int i=str.length()-1;i>=0;i--){
            rev.append(str.charAt(i));
        }
        System.out.println(rev);
        if(str.equals(rev.toString())) {
            System.out.print("Palindrome");
        }else{
            System.out.print("Not Palindrome");
        }
    }
}
 
    

