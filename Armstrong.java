import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=0;
        int sum=0;
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println("Count:"+count);
        while(n>0)    {
            int d=n%10;
            sum=sum+(d*d*d);
            n/=10;
        }
        if(temp==sum){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }

            
    }
}