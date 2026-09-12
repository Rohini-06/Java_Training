import java.util.Scanner;
public class pali2pointerstr{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int l=0;
        int r=str.length()-1;
        while(l<r){
            if(str.charAt(l)==str.charAt(r)){
                System.out.print("Palindrome");
                break;
            }else{
                System.out.print("Not palindrome");
                break;
            }
        }
    }
}
 
    

