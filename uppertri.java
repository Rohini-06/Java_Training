import java.util.Scanner;

public class uppertri{
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
      boolean upper=true;
      for(int i=0;i<r;i++)  {
         for(int j=0;i>j;j++){
            if(a[i][j]!=0){
               upper=false;
               break;
            }
         }
      }
      if(upper){
         System.out.println("Upper Triangle Matrix");
      }else{
         System.out.println("Not an uppertriangle matrix");
      }
        }
}   
   

   
