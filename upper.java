import java.util.Scanner;

public class upper{
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
         boolean up=true;
      for(int i=0;i<r;i++)  {
         for(int j=0;j<c;j++){
            if(i>j&&a[i][j]!=0){
                up=false;
                break;
                
            }else if(i<=j && a[i][j]==0){
                up=false;
                break;
            }
         }
      }
     System.out.println((up)?"Upper Triangle":"No");
        }
}   
   

   
