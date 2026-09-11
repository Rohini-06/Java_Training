import java.util.Scanner;

public class krrotate{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++){
         a[i]=sc.nextInt();
      }
      int k=sc.nextInt();
      for(int i=k;i<n;i++){
         System.out.print(a[i]+" ");
      }
      for(int i=0;i<k;i++){
        System.out.print(a[i]+" ");
      }
      }
   }

   