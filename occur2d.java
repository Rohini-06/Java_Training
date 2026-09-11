import java.util.Scanner;

public class occur2d{
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
      int k=sc.nextInt();
      boolean found=false;
      for(int i=0;i<r;i++){
         for(int j=0;j<c;j++){
            if (a[i][j]==k){
             found=true;
             System.out.print("Found at"+i+","+j);
             break;
         }
         }
        }
             if(!found){
          System.out.print("Not Found");
      
}                      
}
}   
   

   
