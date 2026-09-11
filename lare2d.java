import java.util.Scanner;

public class lare2d{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int r = sc.nextInt();
      int c= sc.nextInt();
      int[][] a=new int[r][c];
      int max=Integer.MIN_VALUE;
      for(int i=0;i<r;i++){
         for(int j=0;j<c;j++){
             a[i][j]=sc.nextInt();
             if(a[i][j]>max){
               max=a[i][j];
             }
         }
         }
      
        System.out.print(max);

}
      
}
      
   

   
