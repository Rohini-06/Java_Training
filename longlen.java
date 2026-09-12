
import java.util.Scanner;
public class longlen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        int maxcount=0;
        for(int i=0;i<s.length();i++){
          if(s.charAt(i)!=' '){
           count++;
            }
         else{
           maxcount=(count>maxcount)?count:maxcount;
           count=0;
        }
    }
    maxcount=(count>maxcount)?count:maxcount;
    System.out.print(maxcount);
}
}