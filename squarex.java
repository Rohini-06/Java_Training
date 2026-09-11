import java.util.Scanner;

public class squarex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c<= n; c++) {
                if(r==1 || r==n || c==1|| c==n||(c+r)%2==0){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
            System.out.println();
        }
    }
}