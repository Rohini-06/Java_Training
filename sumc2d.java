import java.util.Scanner;

public class sumc2d{
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
      
      int max=Integer.MIN_VALUE;
      int col=0;
      for(int j=0;j<c;j++){
        int sum=0;
         for(int i=0;i<r;i++){
            sum+=a[i][j];
         }
         if(sum>max){
            max=sum;
            col=j;

         }
         }
         System.out.print("Column "+(col+1)+"has max sum of"+max);
        }
}   
   

   
