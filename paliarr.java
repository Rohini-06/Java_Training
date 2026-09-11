import java.util.Scanner;

public class paliarr{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++){
         a[i]=sc.nextInt();
      }
      int l = 0;
      int r= n-1;
      while (l<r) {
        if(a[l]==a[r]){
         System.out.println("Palindrome");
         l++;
         r--;
         break;
        }else{
         System.out.println("Not Palindrome");
         break;
      }
      }
   }
}
