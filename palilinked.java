import java.util.Scanner;
import java.util.LinkedList;
public class palilinked {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> marks=new LinkedList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            marks.add(sc.nextInt());
        }
        boolean pali=true;
        for(int i=0;i<marks.size()/2;i++){
            if(!marks.get(i).equals(marks.get(marks.size()-1-i))){
                pali=false;
                break;
            }
        }
        if(pali){
            System.out.print("Palindrome");
        }
        else{
            System.out.print("Not Palindrome");
        }
}
}