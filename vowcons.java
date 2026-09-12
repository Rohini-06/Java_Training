import java.util.Scanner;
public class vowcons {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int vc=0;
        int cc=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='A'||str.charAt(i)=='e'||str.charAt(i)=='E'||str.charAt(i)=='i'||str.charAt(i)=='I'||str.charAt(i)=='o'||str.charAt(i)=='O'||str.charAt(i)=='u'||str.charAt(i)=='U'){
                vc++;
            }else{
                cc++;
            }
               
        }
        System.out.println("Vowels:"+vc);
        System.out.println("Consonants:"+cc);

    }
}

