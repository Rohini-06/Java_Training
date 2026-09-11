import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] marks = new int[n];
        float sum=0;
        for(int i=0;i<n;i++){
            marks[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sum+=marks[i];
        }
        float avg=sum/n;
        System.out.println("Average:"+avg);
    }
}