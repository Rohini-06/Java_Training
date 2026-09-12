import java.util.Scanner;
public class longwordlen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        int maxcount=0;
        for(int i=0;i<s.length();i++){
          if(s.charAt(i)==' '||s.charAt(i)=='.'){
            if(count>maxcount){
                maxcount=count;
            }
            count=0;
        }else{
            count++;
        }
    }
    if(count>maxcount){
        maxcount=count;
    }
    System.out.print(maxcount);
}
}