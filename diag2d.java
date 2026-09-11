import java.util.Scanner;

public class diag2d{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int r = sc.nextInt();
      int c= sc.nextInt();
      int[][] a=new int[r][c];
      for(int i=0;i<r;i++){
         for(int j=0;j<c;j++){
             a[i][j]=sc.nextInt();
         }
         }
         int sum=0;
      for(int i=0;i<r;i++){
         for(int j=0;j<c;j++){
            if(i==j||i+j==r-1){
               sum+=a[i][j];
            }
            
         }
         
         }
         System.out.print(sum);
        }
}   
   

   
