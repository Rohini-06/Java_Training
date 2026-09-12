import java.util.Scanner;
public class revsbf {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder rev=new StringBuilder(str);
        rev.reverse();
        System.out.print(rev);
}
}
